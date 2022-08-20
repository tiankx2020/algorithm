package com.tkx.java.面试题.metaApp;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月05日 17:14
 */
public class T3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        answer(arr);
    }
    public static int[] answer(int[] x) {
        int num = 0;
        if(x.length ==0) num = 6;
        else if(x.length%2==1){
            int mid = x.length/2;
            num+=x[mid];
            for(int i=1;i<=3;i++){
                if(mid-i<0) break;
                num+=x[mid+i];
                num+=x[mid-i];
            }
        }else{
            int i =x.length/2;
            i = Math.max(0,i-3);
            for(int k=i;k<Math.min(i+6,x.length);k++){
                num+=x[k];
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(num);
        sb.append(num);
        char[] cs = sb.toString().toCharArray();
        char[] tmp =new char[cs.length];
        for(int i=0;i<cs.length;i++){
            tmp[i] = cs[i];
        }
        Arrays.sort(tmp);
        int index = 8;
        HashMap<Character,Integer> map  = new HashMap<>();
        for(int i=tmp.length-1;i>=0;i--){
            if(!map.containsKey(tmp[i])){
                map.put(tmp[i],index++);
            }
        }
        int[] arr = new int[cs.length];
        for(int i=0;i<arr.length;i++){
            arr[i] = map.get(cs[i]);
        }
        return arr;
    }
}
