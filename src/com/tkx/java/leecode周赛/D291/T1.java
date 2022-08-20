package com.tkx.java.leecode周赛.D291;

import java.util.LinkedList;
import java.util.List;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月01日 11:17
 */
public class T1 {
    public String removeDigit(String number, char digit) {
        List<String> list = new LinkedList<>();
        for(int i=0;i<number.length();i++){
            if(number.charAt(i)==digit){
                list.add(number.substring(0,i)+number.substring(i+1));
            }
        }
        String ans = list.get(0);
        for(int i=1;i<list.size();i++){
            if(list.get(i).compareTo(ans)>0){
                ans = list.get(i);
            }
        }
        return ans;
    }
}
