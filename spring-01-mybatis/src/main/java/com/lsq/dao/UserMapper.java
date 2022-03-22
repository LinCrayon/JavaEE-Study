package com.lsq.dao;

import com.lsq.pojo.User;

import java.util.List;

/**
 * @author linshengqian
 */
public interface UserMapper {
    //查询全部用户
    List<User> selectUser();


}
