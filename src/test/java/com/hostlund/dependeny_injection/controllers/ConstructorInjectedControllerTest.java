package com.hostlund.dependeny_injection.controllers;

import static org.junit.jupiter.api.Assertions.*;

import com.hostlund.dependeny_injection.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

  ConstructorInjectedController controller;

  @BeforeEach
  void setUp(){
    controller = new ConstructorInjectedController(new GreetingServiceImpl());
  }

  @Test
  void sayGreeting() {
    System.out.println(controller.sayGreeting());
  }
}