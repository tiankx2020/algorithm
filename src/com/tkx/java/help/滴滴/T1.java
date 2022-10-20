package com.tkx.java.help.滴滴;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年09月17日 15:36
 */
public class T1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long y = sc.nextLong();
        List<Long> res = method(y);
        System.out.println(res);
    }

    public static List<Long> method(long y){
        List<Long> list = new ArrayList<>();
        for(long i=1;i<=y;i++){
            long tmp = i;
            // 计算i的二进制数量
            int  num = 0;
            while (tmp>0){
                long mod = tmp%2;
                tmp/=2;
                if(mod==1) num++;
            }
            // 判断是否满足条件
            if(num*i == y){
                list.add(i);
            }
        }
        return list;
    }
}
