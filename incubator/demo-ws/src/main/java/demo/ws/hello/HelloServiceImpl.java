package demo.ws.hello;

import javax.jws.WebService;

@WebService(
        serviceName = "HelloService",
        portName = "HelloServicePort",
        endpointInterface = "demo.ws.hello.HelloService"
)
public class HelloServiceImpl implements HelloService {
    @Override
    public String say(String name) {
        return "Hello " + name;
    }
}
