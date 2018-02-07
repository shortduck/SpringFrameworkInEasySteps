package me.ankit.spring.springAOP.Aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

	@Before("execution(* me.ankit.spring.springAOP.ProductServiceImplementation.multiply(..))")
	public void logBefore(JoinPoint joinPoint) {

		System.out.println("Before calling the method.");

	}

	@After("execution(* me.ankit.spring.springAOP.ProductServiceImplementation.multiply(..))")
	public void logAfter(JoinPoint joinPoint) {

		System.out.println(joinPoint.getTarget());
		System.out.println("After calling the invocation.");

	}

}
