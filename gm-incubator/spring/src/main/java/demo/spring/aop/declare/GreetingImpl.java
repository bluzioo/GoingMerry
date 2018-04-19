package demo.spring.aop.declare;

import org.springframework.stereotype.Component;

@Component
public class GreetingImpl implements Greeting {
    @Override
    public void sayHi(String name) {
        System.out.println("Hi, "+name);
    }
}
