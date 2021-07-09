package com.kuang.service;

import com.kuang.dao.UserDao;
import com.kuang.dao.UserDaoImpl;
import com.kuang.dao.UserDaoMySqlImpl;
import com.kuang.dao.UserDaoOracleImpl;

public class UserServiceImpl implements UserService{
    //如果用程序创造对象，那么但凡有一个新的对象就需要手动创建一次
    //private UserDao userDao = new UserDaoImpl();
    //private UserDao userDao = new UserDaoMySqlImpl();
    //private UserDao userDao = new UserDaoOracleImpl();

    //利用set进行 动态实现 值的注入！
    private UserDao userDao;


    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }


    public void getUser(){
        userDao.getUser();
    }


}
