package me.ankit.spring.SpringJavaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationTest {

	public static void main(String args[]) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		Service bean = context.getBean(Service.class);
		
		bean.save();

	}

}
