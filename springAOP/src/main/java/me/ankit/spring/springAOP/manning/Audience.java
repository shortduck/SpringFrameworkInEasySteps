package me.ankit.spring.springAOP.manning;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect /* WHAT and WHEN */
//@Component
public class Audience {

	// all the pointcuts are same, AspectJ provides a mechanism to define a
	// common pointcut, using
	// @Pointcut

	@Pointcut("execution (* me.ankit.spring.springAOP.manning.Dance.perform(..))")
	public void perform2() {

	}

	/* Pointcut WHERE */
	@Before("execution   (* me.ankit.spring.springAOP.manning.Dance.perform(..))")
	public void silenceCellPhones() {
		System.out.println("Cell phone silenced....");
	}

	@Before("execution (* me.ankit.spring.springAOP.manning.Dance.perform(..))")
	public void takeSeats() {
		System.out.println("seats taken....");
	}

	@AfterReturning("execution (* me.ankit.spring.springAOP.manning.Dance.perform(..))")
	public void clap() {
		System.out.println("clap clap");
	}

	@AfterThrowing("execution (* me.ankit.spring.springAOP.manning.Dance.perform(..))")
	public void throwEggs() {
		System.out.println("thowing rotton eggs......");
	}

}
