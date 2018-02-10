package me.ankit.Spring.springcore.interfaces.annotations;

import org.springframework.stereotype.Component;

@Component
public class OrderDAOImpl implements OrderDAO {

	@Override
	public void createOrder() {
		System.out.println("Order Created..............");
	}
}
