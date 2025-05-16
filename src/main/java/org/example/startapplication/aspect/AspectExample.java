package org.example.startapplication.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class AspectExample {

    @Around("@annotation(org.example.startapplication.annotation.TrackTime)")
    public Object arroud(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        Object proceed = joinPoint.proceed();
        long endTime = System.currentTimeMillis()-startTime;

        log.info("Метод {} завершился за {} ms", joinPoint.getSignature().getName(), endTime);
        return proceed;
    }


    @Around("@annotation(org.example.startapplication.annotation.TrackMethod)")
    public Object trackMethod(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();

        log.info("Метод {} вывелся на: {}",
                joinPoint.getSignature().getName(),
                startTime);

        Object proceed = joinPoint.proceed();
        long endTime = System.currentTimeMillis()-startTime;

        log.info("Метод {} завершился на {} ms", joinPoint.getSignature().getName(), endTime);
        return proceed;
    }
}
