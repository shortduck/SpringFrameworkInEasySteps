package me.ankit.Spring.springcore.DI.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

	String Make;

	@Autowired
	Engine engine;

	public String getMake() {
		return Make;
	}

	public void setMake(String make) {
		Make = make;
	}

	@Override
	public String toString() {
		return "Car [Make=" + Make + ", engine=" + engine + "]";
	}

}
