package com.kuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class EncodingController {
    @RequestMapping("/ee/t1")
    public String test1(String name,Model model){
        System.out.println(name);
        model.addAttribute("msg",name); //获取表单提交的值
        return "hello"; //跳转到hello页面显示输入的值
    }
}
