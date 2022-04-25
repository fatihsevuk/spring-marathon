package com.fth.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DemoAspect {

    //JOINPOINT
    // @Before , @After , @AfterReturning , @AfterThrowing , @Around


//    //JOINPOINT
//    @Before("execution(* com.fth.controller.DemoController.doubleValue(..))")//POINTCUT
//    public void before() {
//        System.out.println("Hello");
//    }
//
//    //JOINPOINT
//    @After("execution(* com.fth.controller.DemoController.doubleValue(..))")//POINTCUT
//    public void after() {
//        System.out.println("World");
//    }

    @Around("execution(* com.fth.controller.DemoController.doubleValue(..))")//POINTCUT
    public void aroundDoubleValue(ProceedingJoinPoint point) throws Throwable {
        // Before
        System.out.println(":)");
        //point.proceed(); // return expected value
        point.proceed(new Object[] {20}); // return new value -> 40
        // After
        System.out.println(":(");
    }


    @Around("execution(* com.fth.controller.DemoController.intValue(..))")//POINTCUT
    public Object aroundIntValue(ProceedingJoinPoint point) throws Throwable {
        Object result = point.proceed();

        int x= (int)result;

        return 2*x;

    }

}
