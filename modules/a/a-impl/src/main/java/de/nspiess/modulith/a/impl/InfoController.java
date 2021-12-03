package de.nspiess.modulith.a.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info")
public class InfoController {

  @GetMapping
  public ResponseEntity<Void> isAlive() {
    return Math.random() > 0.5 ? ResponseEntity.ok().build()
        : ResponseEntity.internalServerError().build();
  }

}
