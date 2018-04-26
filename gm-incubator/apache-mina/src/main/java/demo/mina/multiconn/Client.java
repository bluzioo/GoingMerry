package demo.mina.multiconn;

import com.google.common.util.concurrent.RateLimiter;
import jdk.nashorn.internal.objects.Global;
import org.apache.mina.core.future.ConnectFuture;
import org.apache.mina.core.service.IoConnector;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.ProtocolCodecFilter;
import org.apache.mina.filter.codec.textline.TextLineCodecFactory;
import org.apache.mina.filter.logging.LoggingFilter;
import org.apache.mina.transport.socket.nio.NioSocketConnector;

import java.net.InetSocketAddress;
import java.nio.charset.Charset;



public class Client {

    private final static String HOST = "127.0.0.1";
    private final static int PORT = 9123;

    private static IoConnector connector = null;
    private static IoSession session = null;

    /**
     * 限流
     */
    private static RateLimiter rateLimiter = RateLimiter.create(1);
//    private static Client client = Holder.getInstance();
//
//    private static class Holder {
//        static Client getInstance() {
//            return new Client();
//        }
//    }

    public static void send() {
        if (session == null || session.isClosing()){
            connect();
        }

        rateLimiter.acquire();
        session.write("hello from " + Thread.currentThread().getName());
    }

    private synchronized static void connect() {
        if (session == null || session.isClosing()){
            if (connector == null) {
                connector = new NioSocketConnector();

                connector.getFilterChain().addLast( "logger", new LoggingFilter() );
                connector.getFilterChain().addLast( "codec", new ProtocolCodecFilter( new TextLineCodecFactory( Charset.forName( "GBK" ))));

                connector.setHandler(new ClientHandler());
                System.out.println("create connector for" + Thread.currentThread().getName());
            }

            ConnectFuture future = connector.connect(new InetSocketAddress(HOST, PORT));
            future.awaitUninterruptibly();
            session = future.getSession();

            System.out.println("create session for" + Thread.currentThread().getName());
        }
    }


    public static void main(String[] args) {

        for (int i=0; i<10; i++) {
            new SendThread("T" + i).start();
        }

    }


}
