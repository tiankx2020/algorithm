package com.tkx.java.笔试题.腾讯2022;

import java.util.*;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月24日 21:08
 */
public class T5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //记录元素相对位置
        LinkedList<Character> lc = new LinkedList<>();
        //记录右边1，3，6，8，9....
        List<String> ln = new ArrayList<>();
        //map用于记录每个元素的下标
        Map<Character,Integer> map = new HashMap<>();
        int index = 0;
        while (true){
            String s = sc.nextLine();
            String[] split = s.split(",");
            if(split.length==2){
                lc.add(split[0].charAt(0));
                ln.add(split[1]);
                map.put(split[0].charAt(0),index++);
            }else{
                //先移除要变换位置的元素
                char c = split[0].charAt(0);
                for(int i=0;i<lc.size();i++){
                    if(lc.get(i)==c){
                        lc.remove(i);
                    }
                }
                char c1 = split[1].charAt(0);
                char c2 = split[2].charAt(0);
                //表示换到第一的位置
                if(c1=='0'){
                    lc.add(0,c);
                }else if(c2=='0'){ //表示要换到最后一个位置
                    lc.add(c);
                }else{
                    //表示要换到中间的位置
                    int x = map.get(c2);
                    lc.add(x,c);
                }
                //跳出循环，结束
                break;
            }
        }
        //输出答案
        for(int i=0;i<lc.size();i++){
            System.out.println(lc.get(i)+","+ln.get(i));
        }
    }
}
