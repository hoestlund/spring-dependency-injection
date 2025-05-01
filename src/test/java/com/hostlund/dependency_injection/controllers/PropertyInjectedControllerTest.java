package com.hostlund.dependency_injection.controllers;

import com.hostlund.dependency_injection.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PropertyInjectedControllerTest {

  @Autowired
  PropertyInjectedController controller;

  @Test
  void sayGreeting() {
    System.out.println(controller.sayGreeting());
  }
}