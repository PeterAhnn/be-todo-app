package com.peterahn.betodoapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class beTodoAppController {
    @GetMapping("/")
    public String helloWorld() {
        return "To-do Application !";
    }
}
