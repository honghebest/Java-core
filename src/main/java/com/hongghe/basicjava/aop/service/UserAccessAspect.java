package com.hongghe.basicjava.aop.service;

import com.hongghe.basicjava.annonation.UserAccess;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class UserAccessAspect {

    private static final Logger loggger = LoggerFactory.getLogger(UserAccessAspect.class);

    @Pointcut(value = "@annotation(com.hongghe.basicjava.annonation.UserAccess)")
    public void access() {
        //
    }

    @Before("access()")
    public void deBefore(JoinPoint joinPoint) throws Throwable {
        loggger.error("The access before");
    }

    @Around("@annotation(userAccess)")
    public Object around(ProceedingJoinPoint pjp, UserAccess userAccess) {
        //获取注解里的值
        System.out.println("second around:" + userAccess.desc());
        try {
            return pjp.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            return null;
        }
    }
}
