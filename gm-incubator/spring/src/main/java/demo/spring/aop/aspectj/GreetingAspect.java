package demo.spring.aop.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class GreetingAspect {

    @Around("execution(* demo.spring.aop.aspectj.GreetingImpl.*(..))")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        before();
        Object result = pjp.proceed();
        after();
        return result;
    }

    private void before() {
        System.out.println("Before");
    }

    private void after() {
        System.out.println("After");
    }

    @Around("@annotation(demo.spring.aop.aspectj.Tag)")
    public Object tagBefore(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("tagbefore");
        Object result = pjp.proceed();
        return result;
    }


    @DeclareParents(value = "demo.spring.aop.aspectj.GreetingImpl", defaultImpl = ApologyImpl.class)
    private Apology apology;
}
