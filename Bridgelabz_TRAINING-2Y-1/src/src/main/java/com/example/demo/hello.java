package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {
    @GetMapping("/first")
    public String first() {
        return "first Line";
    }

    @GetMapping("/second")
    public String second() {
        return "second Line";
    }
}
