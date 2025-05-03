package com.hostlund.dependency_injection.services.i18N;

import static org.junit.jupiter.api.Assertions.*;

import com.hostlund.dependency_injection.controllers.i18n.Myi18NController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EnglishGreetingServiceTest {

  @Autowired
  Myi18NController controller;

  @Test
  void sayHello() {
    System.out.println(controller.sayHello());
  }

}