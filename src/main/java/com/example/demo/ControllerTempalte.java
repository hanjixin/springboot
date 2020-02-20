package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.ws.RequestWrapper;

@Controller
class ControllerTempalte {
    @Override
    public String toString() {
        return "ControllerTempalte{}";
    }

    @RequestMapping("/login")
    public String  say (){
        return "login";
    }
    @ResponseBody
    @RequestMapping("/hello2")
    public String hello2() {
        return "213213";
    }
}