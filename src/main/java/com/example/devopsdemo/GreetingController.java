package com.example.devopsdemo;

import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @GetMapping("/")
    public Map<String, String> home() {
        return Map.of("message", "Hello from SCTP DevOps Demo!");
    }
}
