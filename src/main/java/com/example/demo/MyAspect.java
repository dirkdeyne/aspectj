package com.example.demo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {
  
  @Around("@annotation(MyAnnotation)")
  public Object execute(ProceedingJoinPoint joinPoint) throws Throwable{
    System.err.println("Hallo Aspect : " + joinPoint);
    return joinPoint.proceed();
  }
  
}
