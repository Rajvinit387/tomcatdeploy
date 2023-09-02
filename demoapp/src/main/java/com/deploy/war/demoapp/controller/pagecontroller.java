package com.deploy.war.demoapp.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class pagecontroller {

    @RequestMapping("/")
    public String home()
    {
        return "home";
    }


    @RequestMapping("/about")
    public String about()
    {
        return "about";
    }
}
