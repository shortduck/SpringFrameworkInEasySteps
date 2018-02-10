package me.ankit.Spring.springcore.testdi.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	String Name = "Popo";
	
	@Autowired
	Address address;

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

	@Override
	public String toString() {
		return "Employee [Name=" + Name + ", address=" + address + "]";
	}
	
	
	
}
