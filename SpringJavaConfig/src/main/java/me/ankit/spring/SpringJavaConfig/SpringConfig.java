package me.ankit.spring.SpringJavaConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan
public class SpringConfig {

	@Bean
	// @Autowired
	public DAO dao() {
		return new DAO();
	}

	@Bean
	public Service service() {
		return new Service();
	}

}
