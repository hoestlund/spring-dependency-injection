package com.hostlund.dependency_injection.controllers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("prod")
@SpringBootTest
class ProdDataSourceControllerTest {

  @Autowired
  DataSourceController controller;

  final String prod = "jdbc:prod-data-source";

  @Test
  void getDatasourceTest() {
    assertEquals(prod,controller.getDatasource());
  }
}