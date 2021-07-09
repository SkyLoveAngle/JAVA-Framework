package com.kuang.config;

import com.kuang.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //代表这是一个配置类，类似于beans.xml的作用，
// 这个注解本身就是一个@Component，所以它也会被注册到容器中
public class MyConfig {
    //这个注解就相当于我们之前写的<Bean/>标签
    //这个方法的名字，就相当于bean标签中的ID属性
    //这个方法的返回值，就相当于bean标签中的class属性值
    @Bean
    public User getUser() {
        return new User();//就是返回要注入bean中的对象
    }
}
