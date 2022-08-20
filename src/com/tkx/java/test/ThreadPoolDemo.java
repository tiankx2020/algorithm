package com.tkx.java.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年03月29日 16:10
 */
public class ThreadPoolDemo {
    public static void main(String[] args) {
    }


    public ListNode detectCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while(head!=null){
            if(!set.add(head)){
                return head;
            }
            head = head.next;
        }
        return null;
    }
}
class ListNode{
    int val;
    ListNode next;
}
