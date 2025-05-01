package com.hostlund.dependeny_injection.controllers;

import static org.junit.jupiter.api.Assertions.*;

import com.hostlund.dependeny_injection.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

  PropertyInjectedController controller;

  @BeforeEach
  void setUp(){
    controller = new PropertyInjectedController();
    controller.greetingService = new GreetingServiceImpl();
  }

  @Test
  void sayGreeting() {
    System.out.println(controller.sayGreeting());
  }
}