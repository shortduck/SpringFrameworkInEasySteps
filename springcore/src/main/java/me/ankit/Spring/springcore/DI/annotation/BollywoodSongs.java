package me.ankit.Spring.springcore.DI.annotation;

import org.springframework.stereotype.Component;


public class BollywoodSongs implements CompactDisc {

	String Title = "1980s Bollywood songs.....";

	@Override
	public void play() {
		// TODO Auto-generated method stub

		System.out.println("Title :" + Title);

	}

}
