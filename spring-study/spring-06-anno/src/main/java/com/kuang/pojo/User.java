package com.kuang.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component //组件 等价于<bean id="user" class="com.kuang.pojo.User"/>
@Scope

public class User {
    @Value("这是注解上的值：SKY") //<property name = "name" value="这是注解上的值：SKY">
    public String name ;

    //@Value("这是注解上的值：SKY") //也可以放到set方法前面，作用一样！
    public void setName(String name) {
        this.name = name;
    }
}
