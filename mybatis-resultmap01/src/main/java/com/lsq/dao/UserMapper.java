package com.lsq.dao;

import com.lsq.pojo.User;

import java.util.List;

/**
 * @author linshengqian
 */
public interface UserMapper {

    //根据id查询用户
    User selectUserById(int id);



}
