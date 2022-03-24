package com.lsq.mapper;

/**
 * @author linshengqian
 */
public class UserDaoMysqlImpl implements UserDao {
    @Override
    public void getUser(){
        System.out.println("MYSQL获取用户数据");
    }
}
