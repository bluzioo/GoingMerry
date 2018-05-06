package demo.thrift.async;


import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import demo.thrift.Hello;
import org.apache.thrift.async.TAsyncClientManager;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TProtocolFactory;
import org.apache.thrift.transport.TNonblockingSocket;
import org.apache.thrift.transport.TNonblockingTransport;

public class HelloServiceAsyncClient {
    /**
     * 调用 Hello 服务
     * @param args
     */
    public static void main(String[] args) throws Exception {
        try {
            TAsyncClientManager clientManager = new TAsyncClientManager();
            TNonblockingTransport transport = new TNonblockingSocket("127.0.0.1", 8191, 30000);

            TProtocolFactory tprotocol = new TCompactProtocol.Factory();
            Hello.AsyncClient asyncClient = new Hello.AsyncClient(tprotocol, clientManager, transport);
            System.out.println("Client start .....");

            CountDownLatch latch = new CountDownLatch(1);
            MethodCallback callBack = new MethodCallback(latch);
            System.out.println("call method sayHello start ...");
            asyncClient.helloString("hello world", callBack);
            System.out.println("call method sayHello .... end");
            boolean wait = latch.await(30, TimeUnit.SECONDS);
            System.out.println("latch.await =:" + wait);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("startClient end.");

    }
}
