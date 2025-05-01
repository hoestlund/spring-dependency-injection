package com.hostlund.dependeny_injection.controllers;

import static org.junit.jupiter.api.Assertions.*;

import com.hostlund.dependeny_injection.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

  SetterInjectedController setterInjectedController;

  @BeforeEach
  void setUp() {
    setterInjectedController = new SetterInjectedController();
    setterInjectedController.setGreetingService(new GreetingServiceImpl());
  }

  @Test
  void sayGreeting() {
    System.out.println(setterInjectedController.sayGreeting());
  }
}