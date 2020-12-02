package com.onemovieplease.onemovie_please.contollers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainPage {
    @GetMapping("")
    public String mainPage() {
        return "mainPage";
    }
}
