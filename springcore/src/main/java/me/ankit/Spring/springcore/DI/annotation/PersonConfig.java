package me.ankit.Spring.springcore.DI.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonConfig {
	
	
	@Bean
	public Address address(){
		return new Address();
	}
	
	@Bean
	public Person initPerson(Address address){
		
		return new Person(address);
	}

}
