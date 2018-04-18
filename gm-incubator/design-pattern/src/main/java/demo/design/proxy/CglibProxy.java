package demo.design.proxy;

/**
 * 没有接口时使用CGlib
 */
//public class CglibProxy implements MethodInterceptor {
//
//    private static CGLibProxy instance = new CGLibProxy();
//
//    private CGLibProxy() {
//    }
//
//    public static CGLibProxy getInstance() {
//        return instance;
//    }
//
//    public <T> T getProxy(Class<T> cls) {
//        return (T) Enhancer.create(cls, this);
//    }
//
//    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
//        before();
//        Object result = proxy.invokeSuper(obj, args);
//        after();
//        return result;
//    }
//
//    public static void main(String[] args) {
//        HelloImpl helloImpl = CGLibProxy.getInstance().getProxy(HelloImpl.class);
//
//        helloImpl.say("Jack");
//    }
//
//}
