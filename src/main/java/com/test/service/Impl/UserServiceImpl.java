package com.test.service.Impl;

import com.test.dao.UserDao;
import com.test.service.Userservice;

public class UserServiceImpl implements Userservice {

    private UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }   //有参构造

    public UserServiceImpl() {   //无参构造
    }

    //    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }

    @Override
    public void save() {
        userDao.save();
    }


}
