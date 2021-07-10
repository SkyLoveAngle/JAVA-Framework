package com.kuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//有了这句注解就相当于之前springmvc-servlet.xml中的
// <bean id="/hello" class="com.kuang.controller.HelloController"/>
public class HelloController {
    @RequestMapping("/hello")   //URL通过此注解请求过来
    public String hello(Model model){
        //封装数据
        model.addAttribute("msg","Hello.SPringMVCAnnotation!");
        //返回视图
        return "hello"; //这个hello会被视图解析器处理
    }

    //这儿就体现出springmvc的优势了，如果有多个映射请求，
    //原来是要写多个servlet处理，现在只需要写几个方法即可

    /*
    @RequestMapping 这个注解就可以在类上面，也可以在方法上面使用
    区别就在于用在类上面URL的路径就多了一层限定
     */
}
