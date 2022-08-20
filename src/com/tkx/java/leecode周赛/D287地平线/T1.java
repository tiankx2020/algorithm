package com.tkx.java.leecode周赛.D287地平线;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月03日 10:29
 */
public class T1 {
    public int convertTime(String current, String correct) {
        int i1 = Integer.parseInt(current.substring(0,2));
        int i2 = Integer.parseInt(current.substring(3,5));
        int i3 = Integer.parseInt(correct.substring(0,2));
        int i4 = Integer.parseInt(correct.substring(3,5));
        int num1 = i1*60+i2;
        int num2 = i3*60+i4;
        int ans = 0;
        while(num2-num1>=60){
            ans++;
            num2-=60;
        }
        while(num2-num1>=15){
            ans++;
            num2-=15;
        }
        while(num2-num1>=5){
            ans++;
            num2-=5;
        }
        while(num2-num1>=1){
            ans++;
            num2-=1;
        }
        return ans;
    }
}
