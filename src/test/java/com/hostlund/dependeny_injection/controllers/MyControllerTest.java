package com.hostlund.dependeny_injection.controllers;

import org.junit.jupiter.api.Test;

public class MyControllerTest {

  @Test
  void testGreeting(){
    MyController notInject = new MyController();
    System.out.println(notInject.sayGreeting());
  }

}
