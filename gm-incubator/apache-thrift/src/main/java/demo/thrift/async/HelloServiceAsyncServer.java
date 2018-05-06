package demo.thrift.async;

import demo.thrift.Hello;
import demo.thrift.HelloServiceImpl;
import org.apache.thrift.TProcessor;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.server.TNonblockingServer;
import org.apache.thrift.server.TServer;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TNonblockingServerSocket;


public class HelloServiceAsyncServer {
    /**
     * 启动 Thrift 异步服务器
     * @param args
     */
    public static void main(String[] args) {
        try {
            System.out.println("HelloWorld TNonblockingServer start ....");

            TProcessor tprocessor = new Hello.Processor<Hello.Iface>(new HelloServiceImpl());

            TNonblockingServerSocket tnbSocketTransport = new TNonblockingServerSocket(8191);
            TNonblockingServer.Args tnbArgs = new TNonblockingServer.Args(tnbSocketTransport);
            tnbArgs.processor(tprocessor);
            tnbArgs.transportFactory(new TFramedTransport.Factory());
            tnbArgs.protocolFactory(new TCompactProtocol.Factory());

            // 使用非阻塞式IO，服务端和客户端需要指定TFramedTransport数据传输的方式
            TServer server = new TNonblockingServer(tnbArgs);
            server.serve();

        } catch (Exception e) {
            System.out.println("Server start error!!!");
            e.printStackTrace();
        }
    }
}
