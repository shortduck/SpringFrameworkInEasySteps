package me.ankit.spring.springAOP.manning;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ConcertConfig.class)
public class ConcertTest {

	// @Rule
	// public final StandardOutputStreamLog log = new StandardOutputStreamLog();

	@Autowired
	private Audience audience;

	@Autowired
	private Dance dance;

	//@Test
	public void cdShouldNotBeNull() {
		assertNotNull(dance);
	}

	@Test
	public void play() {
		dance.perform();
		//assertEquals("Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles\n");
	}

}
