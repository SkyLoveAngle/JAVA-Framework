package com.kuang.demo01;

//房屋中介（代理角色）
public class Proxy implements Rent{
    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    //中介出租房屋（这是在帮房东做代理）
    public void rent() {
        host.rent();
        System.out.println("我是中介，我帮房东出租房子！");
        seeHouse();
        hetong();
        fare();
    }

    //中介带你看房
    public void seeHouse(){
        System.out.println("中介带你看房字！");
    }

    //签租赁合同
    public void hetong(){
        System.out.println("中介带你签合同！");
    }

    //收取中介费
    public void fare(){
        System.out.println("中介收取中介费！");
    }


}
