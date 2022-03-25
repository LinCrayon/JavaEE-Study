package com.lsq.demo01;

/**
 * @author linshengqian
 */
//抽象角色：租房

public class Host implements Rent {
    @Override
    public void rent() {
        System.out.println("房屋出租");
    }
}
