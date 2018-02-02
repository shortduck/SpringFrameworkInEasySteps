																																																																																																																																																																																																																																																																																																																																																															package me.ankit.Spring.springcore.DI.annotation;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration

public class CDPlayerConfig {
	
	
	@Bean
	public CompactDisc bollywoodSongs(){
		return new BollywoodSongs();
	}
	
	@Bean
	public CDPlayer cdPlayer(CompactDisc cd){
		return new CDPlayer(cd);
	}
	

}
