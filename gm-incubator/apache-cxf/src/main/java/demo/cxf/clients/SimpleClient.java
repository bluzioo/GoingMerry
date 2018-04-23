package demo.cxf.clients;

import demo.cxf.HelloService;
import org.apache.cxf.frontend.ClientProxyFactoryBean;

/**
 * 这种方式仅用于调用 simple 方式发布的 WS，不能调用 JAX-WS 方式发布的 WS
 */
public class SimpleClient {

    public static void main(String[] args) {
        ClientProxyFactoryBean factory = new ClientProxyFactoryBean();
        factory.setAddress("http://localhost:8080/ws/soap/hello");
        factory.setServiceClass(HelloService.class);
        HelloService helloService = factory.create(HelloService.class);
        String result = helloService.say("world");
        System.out.println(result);
    }
}