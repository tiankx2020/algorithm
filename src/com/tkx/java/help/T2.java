package com.tkx.java.help;

import java.util.PriorityQueue;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年09月02日 16:01
 */
public class T2 {

    public  String solution(int w,int[] timeArr){
        int[] windows = new int[w];
        StringBuilder sb = new StringBuilder();
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->{
            if(windows[a]>windows[b]){
                return b-a;
            }else{
                return a-b;
            }
        });

        // for(int i=0;i<timeArr.length;i++){
        //     int index = selectWindow(windows);
        //     windows[index]+=timeArr[i];
        //     sb.append(index+1);
        // }

        return sb.toString();
    }

    public  int selectWindow(int[] windows){
        int res = 0;
        for(int i=0;i<windows.length;i++){
            if(windows[i]<windows[res]){
                res = i;
            }
        }
        return res;
    }
}
