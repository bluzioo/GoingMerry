package demo.javaee.ws;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

public class DynamicClient {

    public static void main(String[] args) throws MalformedURLException {

        URL wsdl = new URL("http://localhost:8080/ws/soap/hello?wsdl");
        QName serviceName = new QName("http://hello.ws.demo/", "HelloService");
        QName portName = new QName("http://hello.ws.demo/", "HelloServicePort");
        Service service = Service.create(wsdl, serviceName);

        HelloService helloService = service.getPort(portName, HelloService.class);
        String result = helloService.say("world");
        System.out.println(result);
    }

}
                                                  