package com.lsq.dao;

import com.lsq.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * @author linshengqian
 */
//public class UserDaoImpl implements UserMapper {
//    private SqlSessionTemplate sqlSession;
//    public void setSqlSession(SqlSessionTemplate sqlSession) {
//        this.sqlSession = sqlSession;
//    }
//    @Override
//    public List<User> selectUser() {
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        return mapper.selectUser();
//    }
//}

public class UserDaoImpl extends SqlSessionDaoSupport implements
        UserMapper {
    @Override
    public List<User> selectUser() {
        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
        return mapper.selectUser();
    }
}

