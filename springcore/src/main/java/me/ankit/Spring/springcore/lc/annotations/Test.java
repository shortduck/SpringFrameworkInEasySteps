package me.ankit.Spring.springcore.lc.annotations;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String args[]) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("me/ankit/Spring/springcore/lc/annotations/config.xml");
		context.registerShutdownHook();
		Patient patient = (Patient) context.getBean("patient");
		System.out.println(patient);
		
		
	}

}
