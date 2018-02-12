package me.ankit.spring.manning.chapter3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MagicBean.class);
		Address address = context.getBean(Address.class);
		//if (address != null)
			System.out.println("Address: " + address);
		/*else
			System.out.println("Add was never created.....");
		*/
	}
}
