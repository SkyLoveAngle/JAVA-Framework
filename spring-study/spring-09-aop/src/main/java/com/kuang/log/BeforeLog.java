package com.kuang.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class BeforeLog implements MethodBeforeAdvice {
    /*
    method:要执行的目标对象的方法
    args:参数
    target：目标对象
     */
    public void before(Method method, Object[] objects, Object target) throws Throwable {
        System.out.println(target.getClass().getName()+"的"
                +method.getName()+"被执行了！");
    }
}
