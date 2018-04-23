package demo.cxf;

import org.springframework.stereotype.Component;

import javax.jws.WebService;

@WebService
@Component
public class HelloServiceImpl implements HelloService {

    public String say(String name) {
        return "hello " + name;
    }
}