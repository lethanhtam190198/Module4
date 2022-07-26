package com.example.book.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BookAspect {
//    @After("execution(* com.example.book.controller.BookController.borrow(..)) ")
//    public void logAfterMethodController(JoinPoint joinPoint) {
//        String method = joinPoint.getSignature().getName();
//        System.err.println("The method just called is:" + method);
//    }
//
//    private int count = 0;
//
//    @Pointcut("within(com.example.book.controller.BookController*) ")
//    public void allControllerPointCut() {
//    }
//
//    @After("allControllerPointCut()")
//    public void countVisitor() {
//        System.err.println("The number of visitor = " + count++);
//    }
}

