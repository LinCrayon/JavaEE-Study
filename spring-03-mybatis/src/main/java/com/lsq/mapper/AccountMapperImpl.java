package com.lsq.mapper;

import com.lsq.pojo.Account;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;


import java.util.List;

/**
 * @author linshengqian
 */
public class AccountMapperImpl extends SqlSessionDaoSupport implements
        AccountMapper {
    @Override
    public List<Account> selectAccount() {
        AccountMapper mapper = getSqlSession().getMapper(AccountMapper.class);
        return mapper.selectAccount();
    }
}

