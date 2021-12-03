package de.nspiess.modulith.c.impl;

import de.nspiess.modulith.b.api.HelloEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class HelloListener {

  private static final Logger log = LoggerFactory.getLogger(HelloListener.class);

  // asynchronous event handling in a different thread. Enabled via @EnableAsync on the Application
  @Async
  @EventListener
  public void helloEvent(HelloEvent event) {
    log.info("Someone said hello to: {}", event.name());
  }

}
