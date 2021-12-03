package de.nspiess.modulith.a.impl;

import de.nspiess.modulith.a.api.NameService;
import org.springframework.stereotype.Service;

@Service
public class NameServiceImpl implements NameService {

  @Override
  public String getName() {
    return Math.random() > 0.5 ? "World" : "Space";
  }

}
