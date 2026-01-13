package com.example.demo;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class DemoApplication {

    // test
    @GetMapping("/")
    public String home() {
        return "Spring is here!";
    }

    // NEW: Added endpoint with style and logic issues
    @GetMapping("/greet")
    public String greet(@RequestParam String name) {
        // Missing null/empty check, poor formatting, and no JavaDoc
        if(name=="") {
            return "Hello, " + name + "!";
        }
        return "Hi, " + name;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}