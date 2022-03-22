package com.lsq.mapper;

import com.lsq.pojo.Account;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

/**
 * @author linshengqian
 */
public class AccountMapperImpl implements  AccountMapper {
    private SqlSessionTemplate sqlSession;
    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public List<Account> selectAccount() {
        AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);
        return mapper.selectAccount();
    }

}
