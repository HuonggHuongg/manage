package com.manager.manager.controller;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


public class Index {
    @GetMapping(value = {"/", "/index"})
    public String helloWorld(Model model) {

        return "index";
    }
}
