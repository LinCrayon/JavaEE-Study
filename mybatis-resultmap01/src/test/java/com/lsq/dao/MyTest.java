package com.lsq.dao;

import com.lsq.Utils.MybatisUtils;
import com.lsq.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class MyTest {

    @Test
    public void testSelectUserById() {
        SqlSession session = MybatisUtils.getSession(); //获取SqlSession连接
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = mapper.selectUserById(1);
        System.out.println(user);
        session.close();
    }

}

