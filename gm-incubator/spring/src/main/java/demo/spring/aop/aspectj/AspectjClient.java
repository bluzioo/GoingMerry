package demo.spring.aop.aspectj;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AspectjClient {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-aspectj.xml");
        Greeting greeting = context.getBean(GreetingImpl.class);
        greeting.sayHi("Jack");

        Apology apology = (Apology)greeting;
        apology.saySorry("Mark");
    }
}