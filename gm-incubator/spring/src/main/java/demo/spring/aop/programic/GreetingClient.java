package demo.spring.aop.programic;

import org.springframework.aop.framework.ProxyFactory;


public class GreetingClient {
    public static void main(String[] args) {
        ProxyFactory factory = new ProxyFactory();
        factory.setTarget(new GreetingImpl());
        factory.addAdvice(new GreetingAfterAdvice());
        factory.addAdvice(new GreetingBeforeAdvice());

        Greeting greeting = (Greeting)factory.getProxy();
        greeting.sayHi("baby");

    }
}
