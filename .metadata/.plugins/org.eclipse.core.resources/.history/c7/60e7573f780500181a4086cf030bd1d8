package me.ankit.Spring.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext cpac = new ClassPathXmlApplicationContext("config.xml");
		Employee emp = (Employee) cpac.getBean("emp");
		System.out.println("id: " + emp.getId());
		System.out.println("name: " + emp.getName());
	}

}
