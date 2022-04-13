package com.test2.demo;

import com.test2.dao.Impl.UserDaoImpl;
import com.test2.dao.UserDao;

public class StaticFactory {
    public static UserDao createUserDao(){
        return new UserDaoImpl();
    }
}
