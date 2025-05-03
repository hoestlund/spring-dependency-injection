package com.hostlund.dependency_injection.services.i18N;

import com.hostlund.dependency_injection.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"en","default"})
@Service("i18NService")
public class EnglishGreetingService implements GreetingService {

  @Override
  public String sayGreeting() {
    return "Hello";
  }
}
