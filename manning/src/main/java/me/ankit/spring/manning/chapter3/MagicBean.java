package me.ankit.spring.manning.chapter3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class MagicBean {

	@Bean
	@Conditional(AddressBeanCondition.class)
	public Address getAddressBean() {
		System.out.println("Magic bean [Address here] created.......");
		return new Address();
	}

}
