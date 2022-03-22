package com.lsq.dao;

import com.lsq.Utils.MybatisUtils;
import com.lsq.pojo.User;
import org.apache.ibatis.session.SqlSession;
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
}

