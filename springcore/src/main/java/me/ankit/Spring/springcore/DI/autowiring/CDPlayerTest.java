package me.ankit.Spring.springcore.DI.autowiring;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {

	@Autowired
	private CompactDisc cd;

	@Autowired
	private Car car;

	@Autowired
	private MediaPlayer player;
	
	@Test
	public void cdShouldNotBeNull() {

	System.out.println(car);

	}
	
	/*
	@Test
	public void testPlay() {
		player.play();
		
	}
*/
	
}
