package com.abc.service;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class AdviceManager {
    //????BeforeAdviceTest??permissionCheck???????
    public void beforeAdvice() {
        System.out.println("????: beforeAdviceTest");
    }
    
    //????AfterReturningAdviceTest??log???????
    public String afterReturning() {
        System.out.println("??????afterReturning");
        return "afterReturning????";
    }
    
    //????AfterThrowingAdviceTest??handleException???????
    @SuppressWarnings({ "null", "unused" })
    public void afterThrowing() {
        System.out.println("?????? afterThrowing");
        try {
            int a = 10 / 0;
        } catch (ArithmeticException ae) {
            System.out.println("?????????????");
        }
        String s = null;
        System.out.println(s.substring(0,3));
    }
    
    //????AfterAdvice??releaseResource???????
    public void afterAdvice() {
        System.out.println("?????? afterAdvice");
    }
    
    //????AroundAdvice??process???????
    public String aroundAdvice(String param1, Integer param2, Object param3) {
        System.out.println("?????? aroundAdvice");
        return param1;
    }
    
    //????AdviceTest???????????
    public String manyAdvices(String param1, String param2) {
        System.out.println("??????manyAdvices");
        return param1 + " ?? " + param2;
    }
    
    //????AccessArgAdviceTest??access???????
    public String accessAdvice(Date d, String n) {
        System.out.println("??????accessAdvice");
        return "aa";
    }
}