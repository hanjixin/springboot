package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody
;
@Controller
class ControllerTest {
    @Override
    public String toString() {
        return "ControllerTest{}";
    }

    @ResponseBody
    @RequestMapping("/test")
    public String  say (){
        return "hello1121";
    }
}