package com.hostlund.dependency_injection.controllers;

import com.hostlund.dependency_injection.services.datasource_conf.DatasourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class DataSourceController {

  private final DatasourceService datasourceService;

  @Autowired
  public DataSourceController(DatasourceService datasourceService) {
    this.datasourceService = datasourceService;
  }

  public String getDatasource(){
    return datasourceService.getDatasource();
  }

}
