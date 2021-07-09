package com.kuang.demo01;

//房客
public class Client {
    public static void main(String[] args) {
        //房东要出租房子
        Host host = new Host();
        //代理角色，找房屋中介，一般会有一些附属操作
        Proxy proxy = new Proxy(host);
        //不需要直接面对房东，找中介即可
        proxy.rent();
    }
}
