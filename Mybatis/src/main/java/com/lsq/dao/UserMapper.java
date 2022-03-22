package com.lsq.dao;

import com.lsq.pojo.User;

import java.util.List;

/**
 * @author linshengqian
 */
public interface UserMapper {
    //查询全部用户
    List<User> selectUser();
    //根据id查询用户
    User selectUserById(int id);
    //添加一个用户
    int addUser(User user);
    //修改一个用户
    int updateUser(User user);

}
