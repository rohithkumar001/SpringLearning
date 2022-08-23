package com.dbs.app;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAscpect {
	@Before("execution(* com.dbs.app.BusinessLogic.getBusinessLogic(..))")
	public void loggingBeforeBusinessLogic(JoinPoint jp) {
		System.out.println("Logging before business logic is running!");
		System.out.println("Before execution of method: "+jp.getSignature().getName());
	}
}
