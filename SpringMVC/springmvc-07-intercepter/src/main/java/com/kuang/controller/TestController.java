package com.kuang.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/t1")
public class TestController {
    @RequestMapping
    public String test(){
        System.out.println("TestController的Test（）执行了！");
        return "Successfully!";
    }
}
