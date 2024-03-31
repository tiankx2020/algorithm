package com.tkx.java.leecode周赛.D391;

/**
 * @Author tkx
 * @Date 2024 03 31
 **/
public class T1 {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int add = 0;
        int temp = x;
        while (x>0){
            add+=x%10;
            x/=10;
        }
        return     temp%add==0?add:-1;
    }
}
