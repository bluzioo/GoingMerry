package demo.cxf.clients;

import demo.cxf.HelloService;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

public class JaxWsClient {

    public static void main(String[] args) {
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
        factory.setAddress("http://localhost:8080/ws/soap/hello");
        factory.setServiceClass(HelloService.class);

        HelloService helloService = factory.create(HelloService.class);
        String result = helloService.say("world");
        System.out.println(result);
    }
}
