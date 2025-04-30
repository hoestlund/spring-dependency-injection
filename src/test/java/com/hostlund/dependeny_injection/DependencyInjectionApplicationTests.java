package com.hostlund.dependeny_injection;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.hostlund.dependeny_injection.controllers.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class DependencyInjectionApplicationTests {

	@Autowired
	ApplicationContext applicationContext;

	@Autowired
	MyController myController;

	@Test
	void testUsingTheInjectedController(){
		String hello = myController.sayHello();
		assertEquals("Hello", hello);
	}

	@Test
	void testGetControllerFromContext(){
		MyController controller = applicationContext.getBean(MyController.class);
		System.out.println(controller.sayHello());

	}

	@Test
	void contextLoads() {
	}

}
