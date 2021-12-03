package de.nspiess.modulith.b.impl;

import de.nspiess.modulith.a.api.NameService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class WebController {

  public WebController(NameService nameService) {
    this.nameService = nameService;
  }

  private final NameService nameService;

  @GetMapping("/hello")
  public String hello() {
    return String.format("Hello %s!", nameService.getName());
  }

}
