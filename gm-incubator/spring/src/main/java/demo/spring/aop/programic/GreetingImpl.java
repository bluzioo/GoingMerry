package demo.spring.aop.programic;

public class GreetingImpl implements Greeting {
    @Override
    public void sayHi(String name) {
        System.out.println("Hi, "+name);
    }
}
