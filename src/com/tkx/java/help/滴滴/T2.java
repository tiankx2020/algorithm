package com.tkx.java.help.滴滴;

import java.util.Scanner;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年09月17日 15:52
 */
public class T2 {
    static String res = "";
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String s = sc.nextLine();
        char[] cs = s.toCharArray();
        method(cs.length-1,cs);
        System.out.println(res);
    }

    public static void method(int index,char[] cs){
        if(index==-1){
            // 判断是否符合条件
            if(cs[0]=='0') return;
            for(int i=1;i<cs.length;i++){
                if(cs[i]==cs[i-1]) return;
            }
            int tmp = 0;
            for(int i=0;i<cs.length;i++){
                tmp+=(cs[i]-'0');
            }
            if(tmp%3!=0) return;
            String s = new String(cs);
            if(res.equals("")) {
                res = s;
                return;
            }
            if(s.compareTo(res)<0){
                res = s;
                return;
            }
            return;
        }
        if(cs[index]=='?'){
            for(int i=0;i<10;i++){
                cs[index] = (char)('0'+i);
                method(index,cs);
                cs[index] = '?';
            }
        }else{
            method(index-1,cs);
        }
    }
}
