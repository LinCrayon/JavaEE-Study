package com.lsq.pojo;

/**
 * @author linshengqian
 */
public class UserT {
    private String name;

    public UserT(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void show(){
        System.out.println("name="+ name );
    }
}
