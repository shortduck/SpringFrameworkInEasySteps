package me.ankit.Spring.springcore.DI.annotation.manning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;

//@ContextConfiguration("me.ankit.Spring.springcore.DI.annotation.manning")
//@ContextConfiguration(classes = JavaConfig.class)
public class Test {

	@Autowired
	private Employee emp;

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		Employee emp = (Employee)context.getBean(Employee.class);
		emp.EmployeeData();
		
		System.out.println(emp);
		
		//Test t = new Test();
		//t.foo();

	}

	void foo() {
		System.out.println(emp);
	}

}
