package com.hostlund.dependency_injection.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
class DevDefaultDataSourceControllerTest {

  @Autowired
  DataSourceController controller;

  final String dev = "jdbc:dev-data-source";

  @Test
  void getDatasourceTest() {
    assertEquals(dev,controller.getDatasource());
  }
}