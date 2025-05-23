package com.hostlund.dependency_injection.services.datasource_conf;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("qa")
public class QADataSourceService implements DatasourceService{

  @Override
  public String getDatasource() {
    return "jdbc:qa-data-source";
  }
}
