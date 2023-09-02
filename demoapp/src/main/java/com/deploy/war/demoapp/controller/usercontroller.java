package com.deploy.war.demoapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class usercontroller {

    @GetMapping("/users")
    public List getusers()
    {
        return List.of("vinit","xxx");

    }
}
