package me.ankit.Spring.springcore.testdi.annotation;

import org.springframework.stereotype.Component;

@Component
public class Address {
	
	String HouseNumber = "10";
	String StreetName = "Madison";
	String City = "Okemos";
	public String getHouseNumber() {
		return HouseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		HouseNumber = houseNumber;
	}
	public String getStreetName() {
		return StreetName;
	}
	public void setStreetName(String streetName) {
		StreetName = streetName;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	@Override
	public String toString() {
		return "Address [HouseNumber=" + HouseNumber + ", StreetName=" + StreetName + ", City=" + City + "]";
	}
		
	
	
		

}
