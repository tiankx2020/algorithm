package com.tkx.java.笔试题.美团2022暑期实习;

import java.util.*;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月23日 17:36
 */
public class T5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n = sc.nextInt();
        int time = 0;
        int cur = -1;
        Queue<Integer> queue = new LinkedList<>();
        //映射元素的退出时间
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            int a,b;
            a = sc.nextInt();
            if(s.equals("ADD")){
                if(queue.isEmpty()){
                    cur = a;
                }else{
                    queue.add(a);
                }
                b = sc.nextInt();
                map.put(a,b+time);
            }

            if(s.equals("QUERY")){
                System.out.println(cur);
            }
            if(s.equals("PASS")){
                time+=a;
                if(cur!=-1){
                    int endTime = map.get(cur);
                }
            }
        }
    }
}
