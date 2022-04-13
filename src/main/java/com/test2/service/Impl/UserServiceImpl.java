package com.test2.service.Impl;

import com.test2.dao.UserDao;
import com.test2.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


//<bean id="userservice" class="com.test.service.Impl.UserServiceImpl" p:userDao-ref="userdao"/>
@Component("userservice")
public class UserServiceImpl implements Userservice {

//        <bean id="userservice3" class="com.test.service.Impl.UserServiceImpl">
//        <constructor-arg name="userDao" ref="userdao"></constructor-arg>
//    </bean>
    @Autowired   //注入
    @Qualifier("userdao")  //要注入的bean
    private UserDao userDao;

//    public UserServiceImpl(UserDao userDao) {
//        this.userDao = userDao;
//    }   //有参构造
//
//    public UserServiceImpl() {   //无参构造
//    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        userDao.save();
    }


}
