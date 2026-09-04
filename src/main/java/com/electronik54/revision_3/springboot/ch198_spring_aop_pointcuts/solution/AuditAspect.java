package com.electronik54.revision_3.springboot.ch198_spring_aop_pointcuts.solution;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/** Uses @annotation(...) pointcut so only annotated methods are advised. */
@Aspect
@Component
public class AuditAspect {

    @Pointcut("@annotation(auditable)")
    public void auditedMethod(Auditable auditable) {
    }

    @Around("auditedMethod(auditable)")
    public Object audit(ProceedingJoinPoint pjp, Auditable auditable) throws Throwable {
        System.out.println("AUDIT: method " + pjp.getSignature().getName() + " invoked");
        return pjp.proceed();
    }
}