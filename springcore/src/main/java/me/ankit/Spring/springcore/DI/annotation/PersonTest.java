package me.ankit.Spring.springcore.DI.annotation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = PersonConfig.class)

public class PersonTest {
	
	@Autowired
	Person person;
	
	@Test
	public void printPerson(){
		System.out.println(person);
	}
	

}
