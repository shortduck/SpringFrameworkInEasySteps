package me.ankit.Spring.springcore.DI.annotation.manning;

public class Address {
	
	String HouseNumber = "10";
	String StreetNamr = "Madison";
	public String getHouseNumber() {
		return HouseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		HouseNumber = houseNumber;
	}
	public String getStreetNamr() {
		return StreetNamr;
	}
	public void setStreetNamr(String streetNamr) {
		StreetNamr = streetNamr;
	}
	@Override
	public String toString() {
		return "Address [HouseNumber=" + HouseNumber + ", StreetNamr=" + StreetNamr + "]";
	}
	
	
	

}
