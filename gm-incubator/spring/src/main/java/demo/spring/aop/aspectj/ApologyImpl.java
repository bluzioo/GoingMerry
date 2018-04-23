package demo.spring.aop.aspectj;

public class ApologyImpl implements Apology {
    @Override
    public void saySorry(String name) {
        System.out.println("sorry, " + name);
    }
}
