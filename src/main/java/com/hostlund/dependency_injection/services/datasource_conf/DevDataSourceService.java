package com.hostlund.dependency_injection.services.datasource_conf;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"dev","default"})
public class DevDataSourceService implements DatasourceService{

  @Override
  public String getDatasource() {
    return "jdbc:dev-data-source";
  }
}
