package me.ankit.spring.springAOP.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import me.ankit.spring.springAOP.ProductService;

public class TestClass {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("me/ankit/spring/springAOP/test/config.xml");

		ProductService productService = (ProductService) context.getBean("productService");
		System.out.println(productService.multiply(4, 5));
		

	}

}
