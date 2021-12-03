package de.nspiess.modulith.b.impl;

import de.nspiess.modulith.a.api.NameService;
import de.nspiess.modulith.b.api.HelloEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class GreetController {

  public GreetController(NameService nameService, ApplicationEventPublisher eventPublisher) {
    this.nameService = nameService;
    this.eventPublisher = eventPublisher;
  }

  private final NameService nameService;
  private final ApplicationEventPublisher eventPublisher;

  @GetMapping
  public String hello() {
    var greeted = nameService.getName();

    eventPublisher.publishEvent(new HelloEvent(greeted));

    return String.format("Hello %s!", greeted);
  }

}
