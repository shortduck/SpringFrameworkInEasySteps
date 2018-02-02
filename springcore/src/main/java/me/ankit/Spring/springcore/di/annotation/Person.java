package me.ankit.Spring.springcore.DI.annotation;

public class Person {

	private String Name;
	private Address address;

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
