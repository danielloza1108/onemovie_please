package com.onemovieplease.onemovie_please.contollers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainPage {
    @GetMapping("")
    public String mainPage(){
        return "mainPage";
    }
    @GetMapping("/")
    public String mainPage2(){
        return "mainPage";
    }
}
