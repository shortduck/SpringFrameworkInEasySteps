package me.ankit.springboot.springboot;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import me.ankit.springboot.springboot.Service.Service;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootApplicationTests {

	@Autowired
	ApplicationContext context; 
	
	@Test
	public void contextLoads() {
	}

	@Test
	public void testService() {
		Service bean = context.getBean(Service.class);
		bean.save();
		
	}

}