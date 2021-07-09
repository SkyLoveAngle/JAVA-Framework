package com.kuang.demo04;

import com.kuang.demo03.Rent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//用这个类来“动态生成”我们的代理类
public class ProxyInvocationHandler implements InvocationHandler {

    //被代理的接口
    private Object target;

    public void setTarget(Object target){
        this.target = target;
    }

    //生成得到代理类,这个代码是固定的，只需要改动“rent”就可以
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                this);
    }

    //处理代理实例，并返回结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //动态代理的本质就是使用反射机制实现！
        log(method.getName());
        Object result = method.invoke(target,args);
        return result;
    }

    public void log(String msg){
        System.out.println("执行了" + msg + "方法！");
    }
}
