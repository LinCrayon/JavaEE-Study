package com.lsq.service;

import com.lsq.mapper.UserDao;

/**
 * @author linshengqian
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao ;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
