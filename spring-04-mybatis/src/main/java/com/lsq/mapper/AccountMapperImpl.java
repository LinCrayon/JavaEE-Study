package com.lsq.mapper;

import com.lsq.pojo.Account;
import org.mybatis.spring.SqlSessionTemplate;


import java.util.List;

/**
 * @author linshengqian
 */
public class AccountMapperImpl implements AccountMapper{

    private SqlSessionTemplate sqlSession;
    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public List<Account> selectAccount() {
        Account account = new Account(3,"小币",150.5);
        AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);
        mapper.addAccount(account);
        mapper.deleteAccount(7);
        return mapper.selectAccount();
    }
    //新增

    @Override
    public int addAccount(Account account) {
        AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);
        return mapper.addAccount(account);
    }
    //删除

    @Override
    public int deleteAccount(int id) {
        AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);
        return mapper.deleteAccount(id);
    }
}

