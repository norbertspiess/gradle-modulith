package de.nspiess.modulith.b.impl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/b")
public class WebController {
    @GetMapping
    public String hello() {
        return "Hello world!";
    }
}
