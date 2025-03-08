package org.example.blogbackend.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("")
public class HelloWorldController {

    @GetMapping("")
    public HashMap<String, String> helloWorld() {
        HashMap<String, String> result = new HashMap<>();
        result.put("hello", "world");
        return result;
    }
}
