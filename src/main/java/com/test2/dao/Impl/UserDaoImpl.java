package com.test2.dao.Impl;

import com.test2.dao.UserDao;
import org.springframework.stereotype.Component;


//<bean id="userdao" class="com.test.dao.Impl.UserDaoImpl"></bean>
@Component("userdao")
public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("save!");
    }
}
