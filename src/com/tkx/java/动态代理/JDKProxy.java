package com.tkx.java.动态代理;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月02日 14:25
 */
public class JDKProxy {
    public static void main(String[] args) {
        UserDaoImpl userDaoImpl = new UserDaoImpl();
        UserDao userDao  = (UserDao)Proxy.newProxyInstance(userDaoImpl.getClass().getClassLoader(), userDaoImpl.getClass().getInterfaces(),
                new UserDaoProxy(userDaoImpl));

        int result = userDao.add(1, 2);
        String message = userDao.getMessage("可乐");
        System.out.println(message);
    }
}

class UserDaoProxy implements InvocationHandler{

    private  Object obj;

    public UserDaoProxy(Object obj){
        this.obj = obj;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //执行方法之前
        System.out.println("执行的方法是"+method.getName() +",传递的参数为"+ Arrays.toString(args));
        //执行方法
        Object result = method.invoke(obj, args);
        //执行方法之后
        System.out.println("方法执行完了");
        return result;
    }
}
