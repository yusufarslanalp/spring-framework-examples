package com.example.aopexample.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {

    @Before("execution(* com.example.aopexample.service.Message.getMessage(..))")
    public void msgAspect(JoinPoint joinPoint) {
        System.out.println("The parameter passed to get message function is: " + joinPoint.getArgs()[0]);
        System.out.println( "The method signature is: " + joinPoint.getSignature());
    }/**/


    @After("execution(* com.example.aopexample.service.Message.getMessage(..))")
    public void mesajVerMetodundanSonra(JoinPoint joinPoint) {
        System.out.println( "methot " + joinPoint.getSignature().getName() + " has finished." );

    }

}
