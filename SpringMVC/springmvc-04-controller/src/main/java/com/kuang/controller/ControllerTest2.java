package com.kuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //代表修饰的类会被Spring接管,被这个注解修饰的类中的所有方法，
// 如果返回值是String，并且有具体的页面可以跳转，那么就会被视图解析器解析
public class ControllerTest2 {
    @RequestMapping("/t1")
    public String Hello1(Model model){
        model.addAttribute("msg","ControllerTest2");
        return "hello";  //会拼接成： WEB-INF/jsp/hello.jsp
    }

    @RequestMapping("/t2")
    public String Hello2(Model model){
        model.addAttribute("msg","都是用的hello.jsp的页面！");
        return "hello";  //会拼接成： WEB-INF/jsp/hello.jsp
    }
}
