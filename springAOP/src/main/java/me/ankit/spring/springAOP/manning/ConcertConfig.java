package me.ankit.spring.springAOP.manning;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class ConcertConfig {

	@Bean
	public Audience audiance(){
		return new Audience();
	}
	
	@Bean
	public Dance dance(){
		return new Dance();
	}

}
