package com.lsq.mapper;

import com.lsq.Utils.MybatisUtils;
import com.lsq.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MyTest {
    @Test
    public void testGetAllUser() {
        SqlSession session = MybatisUtils.getSession();
//本质上利用了jvm的动态代理机制
        UserMapper mapper = session.getMapper(UserMapper.class);
    List<User> users = mapper.getAllUser();
        for (User user : users){
            System.out.println(user);
        }
        session.close();
    }

    @Test
    public void testSelectUserById() {
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = mapper.selectUserById(1);
        System.out.println(user);
        session.close();
    }

    @Test
    public void testAddUser() {
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = new User(12, "lin", "123456");
        mapper.addUser(user);
        session.commit(); //提交事务,重点!不写的话不会提交到数据库
        System.out.println(user);
        session.close();
    }

    @Test
    public void testUpdateUser() {
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = new User(12, "秦", "abc123");
        mapper.updateUser(user);
        session.commit();
        System.out.println(user);
        session.close();
    }

    @Test
    public void testDeleteUser() {
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        mapper.deleteUser(12);
        session.commit();
        session.close();
    }


}
