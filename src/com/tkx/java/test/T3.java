package com.tkx.java.test;

import java.util.Scanner;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月02日 16:45
 */
public class T3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            if(method(s.toCharArray())){
                ans++;
            }
        }
        System.out.println(ans);
    }

    //核心代码
    public static boolean method(char[] cs){
        if(cs.length>10||cs.length<=0) return false;
        for (int i = 0; i < cs.length; i++) {
            if( !(cs[i]>='a'&&cs[i]<='z') || (cs[i]>='A'&&cs[i]<='Z')){
                return false;
            }
        }
        return true;
    }
}
