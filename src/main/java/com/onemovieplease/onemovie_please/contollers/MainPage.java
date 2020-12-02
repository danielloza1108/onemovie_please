package com.onemovieplease.onemovie_please.contollers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class MainPage{
    @GetMapping("")
    @ResponseBody
    public String mainPage() {
        return "mainPage";
    }
}
