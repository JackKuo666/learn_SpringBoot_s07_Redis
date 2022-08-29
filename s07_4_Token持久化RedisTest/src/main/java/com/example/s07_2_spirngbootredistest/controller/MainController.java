package com.example.s07_2_spirngbootredistest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @RequestMapping("/index")
    @ResponseBody
    public String index(){
        return "hello World!";
    }
}
