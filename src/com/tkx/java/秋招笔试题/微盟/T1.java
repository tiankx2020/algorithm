package com.tkx.java.秋招笔试题.微盟;

import com.tkx.java.ListNode;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年10月27日 15:42
 */
public class T1 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(5);
        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(4);
        l2.next.next = new ListNode(6);

        ListNode listNode = mergeListNode(l1, l2);
        ListNode p = listNode;
        while (p!=null){
            System.out.println(p.val);
             p = p.next;
        }
    }
    public static ListNode mergeListNode(ListNode l1,ListNode l2){
        if(l1== null) return l2;
        if(l2 == null) return l1;
        if(l1.val<=l2.val){
            l1.next = mergeListNode(l1.next,l2);
            return l1;
        }else{
            l2.next = mergeListNode(l1,l2.next);
            return l2;
        }
    }
}
