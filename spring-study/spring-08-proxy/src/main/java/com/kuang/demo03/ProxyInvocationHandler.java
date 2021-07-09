package com.kuang.demo03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//用这个类来“动态生成”我们的代理类
public class ProxyInvocationHandler implements InvocationHandler {

    //被代理的接口
    private Rent rent;

    public void setRent(Rent rent){
        this.rent = rent;
    }

    //生成得到代理类,这个代码是固定的，只需要改动“rent”就可以
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),
                rent.getClass().getInterfaces(),
                this);
    }

    //处理代理实例，并返回结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //动态代理的本质就是使用反射机制实现！
        seeHouse();
        Object result = method.invoke(rent,args);
        fare();
        return result;
    }

    public void seeHouse(){
        System.out.println("中介带着看房子！");
    }

    public void fare(){
        System.out.println("中介收取中介费！");
    }
}
