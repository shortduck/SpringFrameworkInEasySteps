package me.ankit.Spring.springcore.DI.autowiring;

import org.springframework.stereotype.Component;

@Component
public class Engine {
	
	private String Size;
	
	
	
	public String getSize() {
		return Size;
	}

	public void setSize(String size) {
		Size = size;
	}

	@Override
	public String toString() {
		return "Engine [Size=" + Size + "]";
	}
	
	
	

}
