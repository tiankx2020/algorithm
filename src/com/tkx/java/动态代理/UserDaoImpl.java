package com.tkx.java.动态代理;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月02日 14:25
 */
public class UserDaoImpl implements UserDao{
    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public String getMessage(String s) {
        return "获得信息"+s;
    }
}
