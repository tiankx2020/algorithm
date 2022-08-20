package com.tkx.java.牛客top100.堆_栈_队列;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月19日 19:18
 */
public class BM45滑动窗口的最大值 {
    public ArrayList<Integer> maxInWindows(int [] num, int size) {
        ArrayDeque<Integer> arrayDeque  =new ArrayDeque<>();
        ArrayList<Integer> list = new ArrayList<>();
        //单调递减
        for(int i=0;i<size;i++){
            while (!arrayDeque.isEmpty() && arrayDeque.getLast()<num[i]){
                arrayDeque.removeLast();
            }
            arrayDeque.addLast(num[i]);
        }
        list.add(arrayDeque.getFirst());
        for(int i=size;i<num.length;i++){
            //
            while (!arrayDeque.isEmpty() && arrayDeque.getLast()<num[i]){
                arrayDeque.removeLast();
            }
            arrayDeque.addLast(num[i]);
            if(num[i-size]==arrayDeque.getFirst()){
                arrayDeque.removeFirst();
            }
            list.add(arrayDeque.getFirst());
        }
        return  list;
    }
}
