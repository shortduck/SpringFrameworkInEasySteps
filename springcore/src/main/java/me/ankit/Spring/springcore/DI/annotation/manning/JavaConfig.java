package me.ankit.Spring.springcore.DI.annotation.manning;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	
	@Bean
	public Employee getEmployee(){
		System.out.println("emp init");
		return new Employee();
	}
	
	@Bean
	public Address getAddress(){
		System.out.println("address init");
		return new Address();
	}

}
