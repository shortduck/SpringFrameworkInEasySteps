package me.ankit.Spring.springcore.DI.annotation.manning;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

	String Name = "Ankit";
	
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

	public void EmployeeData() {
		System.out.println("inside EmployeeData.....");
	}

}
