package me.ankit.Spring.springcore.DI.autowiring;

import org.springframework.stereotype.Component;

@Component
public class BollywoodSongs implements CompactDisc {

	String Title = "1980s Bollywood songs.....";

	@Override
	public void play() {
		// TODO Auto-generated method stub

		System.out.println("Title :" + Title);

	}

}
