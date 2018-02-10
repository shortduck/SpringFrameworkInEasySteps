package me.ankit.Spring.springcore.interfaces.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderBOImpl implements OrderBO {
	
	@Autowired
	OrderDAO dao;

	@Override
	public void placeOrder() {
		dao.createOrder();
		System.out.println("Order placed......");

	}

}
