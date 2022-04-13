package com.test.dao.Impl;

import com.test.dao.UserDao;

public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("save!");
    }
}
