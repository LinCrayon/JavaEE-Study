package com.lsq.dao;

import com.lsq.Utils.MybatisUtils;
import com.lsq.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.List;

public class MyTest {
    @Test
    public void test() {
        SqlSession session = MybatisUtils.getSqlSession();

//          方法一
//        List<User> users =
//                session.selectList("com.lsq.dao.UserMapper.selectUser");

//          方法二
        UserMapper mapper =session.getMapper(UserMapper.class);
        List<User> users = mapper.selectUser();

        for (User user: users){
            System.out.println(user);
        }
        session.close();
    }
    @Test
    public void testSelectUserById() {
        SqlSession session = MybatisUtils.getSession(); //获取SqlSession连接
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = mapper.selectUserById(3);
        System.out.println(user);
        session.close();
    }


    static Logger logger = Logger.getLogger(MyTest.class);
    @Test
    public void selectUser() {
        logger.info("info：进入selectUser方法");
        logger.debug("debug：进入selectUser方法");
        logger.error("error: 进入selectUser方法");
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        List<User> users = mapper.selectUser();
        for (User user : users) {
            System.out.println(user);
        }
        session.close();
    }

    @Test
    public void testAddUser() {
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = new User(11,"王1","z1551");
        int i = mapper.addUser(user);
        System.out.println(i);
        session.commit(); //提交事务,重点!不写的话不会提交到数据库
        session.close();
    }

    @Test
    public void testUpdateUser() {
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = mapper.selectUserById(11);
        user.setName("交换");
        user.setPwd("1250diff1");
        int i = mapper.updateUser(user);
        System.out.println(i);
        session.commit(); //提交事务,重点!不写的话不会提交到数据库
        session.close();
    }

    @Test
    public void testDeleteUser() {
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        int i = mapper.deleteUser(10);
        System.out.println(i);
        session.commit(); //提交事务,重点!不写的话不会提交到数据库
        session.close();
    }
}

