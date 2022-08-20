package com.tkx.java.热点题目;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月10日 21:31
 */
public class 判断一个数是否是2的N次幂 {
    public static void main(String[] args) {
        for(int i=1;i<=1024;i++){
            if(method(i)==true){
                System.out.println(i);
            }
        }
    }

    public static boolean method(int x){
        while(x%2==0){
            x/=2;
        }
        return x==1;
    }
}
