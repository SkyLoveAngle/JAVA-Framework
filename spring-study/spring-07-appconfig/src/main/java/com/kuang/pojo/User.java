package com.kuang.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component //此处这个注解的意思就是说明这个类被Spring接管了，注册到了容器中
public class User {
    public String name;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    @Value("SKY")
    public void setName(String name) {
        this.name = name;
    }
}
