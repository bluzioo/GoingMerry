package demo.mina.multiconn;

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


    public void connect() {
        IoConnector connector = new NioSocketConnector();

        connector.getFilterChain().addLast( "logger", new LoggingFilter() );
        connector.getFilterChain().addLast( "codec", new ProtocolCodecFilter( new TextLineCodecFactory( Charset.forName( "GBK" ))));

        connector.setHandler(new ClientHandler());

        ConnectFuture future = connector.connect(new InetSocketAddress(HOST, PORT));
        future.awaitUninterruptibly();
        IoSession session = future.getSession();

        session.write("你好啊");
    }


    public static void main(String[] args) {

        Client client = new Client();
        client.connect();

    }


}
