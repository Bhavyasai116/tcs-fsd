package com.tcs.rest.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.tcs.rest.resource.Product;

import lombok.extern.slf4j.Slf4j;

@Aspect
@Component
@Slf4j

public class ResourceInterceptorAspect3 {
	
	@Pointcut("execution(* com.tcs.rest.resources.*.*(..))")
	public void loggingPointCut() {
		
	}
	@Around("loggingPointCut()")
	public Object around(ProceedingJoinPoint joinPoint) throws Throwable{
		log.info("Before method invoked::"+joinPoint.getSignature());
		log.info("Before mehod invoked::"+joinPoint.getArgs()[0]);
		Object object=joinPoint.proceed();
		
		
		if(object instanceof Product)
			log.info("After method invoked::"+joinPoint.getSignature());
		log.info("After method invoked::"+joinPoint.getArgs()[0]);
		return object;
	}
	
	
	
}
