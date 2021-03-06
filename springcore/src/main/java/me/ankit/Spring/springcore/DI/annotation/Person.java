package me.ankit.Spring.springcore.DI.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {

	private String Name;
	
	@Autowired
	private Address address;
	
	public Person(Address address){
		this.address = address;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
