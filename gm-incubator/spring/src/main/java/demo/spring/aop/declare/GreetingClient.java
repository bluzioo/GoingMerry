package demo.spring.aop.declare;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GreetingClient {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-greeting.xml");
        Greeting greeting = (Greeting) context.getBean("greetingProxy");
        greeting.sayHi("Jack");
    }
}
