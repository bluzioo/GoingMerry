package demo.ws.hello;

import javax.jws.WebService;

@WebService
public interface HelloService {
    String say(String name);
}
                                                  