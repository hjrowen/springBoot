package com.hihi.springaop.conf;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * @author Hejiaran
 */
@Aspect
public class LogAspectJ {

    /**
     * 定义一个切入点
     */
    @Pointcut("execution(* com.hihi.springaop.impl.SayHelloImp.*(..))")
    public void pointCut() {}

    /**
     * Before通知，会在执行目标方法前执行
     * @param joinPoint
     */
    @Before(value = "pointCut()")
    public void beforeMethod(final JoinPoint joinPoint) {
        System.out.println(String.format("before method name = %s", joinPoint.getSignature().getName()));
    }

    /**
     * After通知，目标方法执行后、返回前执行
     * @param joinPoint
     */
    @After(value = "pointCut()")
    public void afterMethod(final JoinPoint joinPoint) {
        System.out.println(String.format("after method name = %s", joinPoint.getSignature().getName()));
    }

    /**
     * AfterReturning通知，目标方法返回返回值后执行
     * @param joinPoint
     */
    @AfterReturning(value = "pointCut()")
    public void afterMethodReturn(final JoinPoint joinPoint) {
        System.out.println(String.format("after return method name = %s", joinPoint.getSignature().getName()));
    }

    /***
     * AfterThrowing通知，目标方法异常后执行
     * @param joinPoint
     */
    @AfterThrowing(value = "pointCut()")
    public void afterMethodThrowing(final JoinPoint joinPoint) {
        System.out.println(String.format("after throwing method name = %s", joinPoint.getSignature().getName()));

    }
}
