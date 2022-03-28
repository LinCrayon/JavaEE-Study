package com.lsq.mapper;

import com.lsq.pojo.Account;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.List;


public class MyTest {
    @Test
    public void test01() throws  IOException{
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountMapper accountMapper = context.getBean("accountMapper",AccountMapper.class);
        for (Account account : accountMapper.selectAccount()){
            System.out.println(account);
        }
    }
}
