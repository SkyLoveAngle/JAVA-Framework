package com.kuang.controller;

import com.kuang.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class AjaxController {
    @RequestMapping("/t1")
    public String test(){
        return "hello";
    }

    @RequestMapping("/a1")
    public void ajax1(String name , HttpServletResponse response) throws IOException {
        if ("admin".equals(name)){
            response.getWriter().print("true");
        }else{
            response.getWriter().print("false");
        }
    }

    @RequestMapping("/a2")
    public List<User> ajax2(){
        List<User> list = new ArrayList<User>();
        list.add(new User("SKY1号",1,"男"));
        list.add(new User("SKY2号",2,"女"));
        list.add(new User("SKY3号",3,"男"));
        return list; //由于@RestController注解，将list转成json格式返回
    }

    @RequestMapping("/a3")
    public String ajax3(String name,String pwd){
        String msg = "";
        //模拟数据库中存在数据(这些数据应该在数据库中查询，就是需要整合mybatis)
        if (name!=null){
            if ("admin".equals(name)){
                msg = "OK";
            }else {
                msg = "Wrong Name";
            }
        }
        if (pwd!=null){
            if ("123456".equals(pwd)){
                msg = "OK";
            }else {
                msg = "Wrong Password";
            }
        }
        return msg; //由于@RestController注解，将msg转成json格式返回
    }
}
