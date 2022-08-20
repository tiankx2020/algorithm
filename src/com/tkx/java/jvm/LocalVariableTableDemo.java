package com.tkx.java.jvm;

/**
 * @Description: 局部变量表demo
 * @author: scott
 * @date: 2022年03月30日 15:49
 */
public class LocalVariableTableDemo {
     double f = 1.0;
    public void method(){
        int a = 1;
        short b = 2;
        String s = "123";
        f = 2.0;
    }
}
