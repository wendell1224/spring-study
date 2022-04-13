package com.test2.demo;

import com.test2.service.Userservice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDemo {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
//        UserDao userDao = (UserDao) app.getBean("userdao");
//        userDao.save();
//
//        UserDao staticcreate = (UserDao) app.getBean("staticuserdao");
//        staticcreate.save();
//
//        UserDao instancecreate = (UserDao) app.getBean("instancefactory");
//        instancecreate.save();

        Userservice userservice = (Userservice) app.getBean("userservice");
        userservice.save();

//        Userservice userservice3 = (Userservice) app.getBean("userservice3");
//        userservice3.save();
    }
}
