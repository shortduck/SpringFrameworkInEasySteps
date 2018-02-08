package me.ankit.Spring.springcore.DI.annotation.manning;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = JavaConfig.class)
public class EmployeeTest {

	@Autowired
	private Employee emp;

	@Test
	public void cdShouldNotBeNull() {
		assertNotNull(emp);
	}

	@Test
	public void play() {
		emp.EmployeeData();
	}

}
