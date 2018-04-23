package demo.spring.aop.aspectj;

import org.springframework.stereotype.Component;

@Component
public class GreetingImpl implements Greeting {

    @Tag
    @Override
    public void sayHi(String name) {
        System.out.println("Hi, "+name);
    }
}
