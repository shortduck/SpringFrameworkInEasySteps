package me.ankit.Spring.springcore.DI.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer{
	
	
	@Autowired
	CompactDisc cd;
	
	public CDPlayer(CompactDisc cd) {
		this.cd = cd;
	}

	@Override
	public void play() {
		cd.play();
	}

}
