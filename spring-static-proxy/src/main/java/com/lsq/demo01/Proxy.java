package com.lsq.demo01;

/**
 * @author linshengqian
 */
//代理角色：中介

public class Proxy implements Rent {
    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        seeHouse();
        this.host = host;
        fare();
    }

    //租房
    @Override
    public void rent() {
        host.rent();
    }
    //看房
    public void seeHouse(){
        System.out.println("带房客看房");
    }
    //收中介费
    public void fare(){
        System.out.println("收中介费");
    }

}
