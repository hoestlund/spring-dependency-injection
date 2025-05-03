package com.hostlund.dependency_injection.services.i18N;

import com.hostlund.dependency_injection.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("se")
@Service("i18NService")
public class SwedishGreetingService implements GreetingService {

  @Override
  public String sayGreeting() {
    return "Hej!";
  }
}
