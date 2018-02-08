package me.ankit.Spring.springcore.interfaces.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext config = new AnnotationConfigApplicationContext(JavaConfig.class);
		OrderBO order = config.getBean(OrderBOImpl.class);
		order.placeOrder();
	}
}
