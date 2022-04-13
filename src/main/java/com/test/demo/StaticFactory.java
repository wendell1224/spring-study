package com.test.demo;

import com.test.dao.Impl.UserDaoImpl;
import com.test.dao.UserDao;

public class StaticFactory {
    public static UserDao createUserDao(){
        return new UserDaoImpl();
    }
}
