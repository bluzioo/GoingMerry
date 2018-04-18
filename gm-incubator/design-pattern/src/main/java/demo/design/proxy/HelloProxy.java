package demo.design.proxy;

/**
 * 静态代理
 */
public class HelloProxy implements Hello {

    private Hello hello;

    HelloProxy() {
        this.hello = new HelloImpl();
    }

    @Override
    public void say(String name) {
        before();
        hello.say(name);
        after();
    }

    private void before() {
        System.out.println("before");
    }

    private void after() {
        System.out.println("after");
    }


    public static void main(String[] args) {
        Hello proxy = new HelloProxy();
        proxy.say("Jack");
    }
}
