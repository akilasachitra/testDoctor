package com.example.testdoctor.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/doctors")
public class Doctor {


    @GetMapping("/dd11")
    public Map<String, String> getDoctors() {
        return Map.of("Message", " test message");
    }

}
