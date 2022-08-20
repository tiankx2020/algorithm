package com.tkx.java.牛客top100.链表;

import com.tkx.java.ListNode;

/**
 * @Description: 重点
 * @author: scott
 * @date: 2022年04月18日 8:49
 */
public class BM12单链表排序 {
    public ListNode sortInList(ListNode head){
        if(head==null || head.next == null){
            return  head;
        }
        ListNode left = head;
        ListNode mid = head.next;
        ListNode right = head.next.next;
        while(right!=null && right.next!=null){
            left = left.next;
            mid = mid.next;
            right = right.next.next;
        }
        left.next = null;
        return merge(sortInList(head),sortInList(mid));
    }

    public ListNode merge(ListNode node1,ListNode node2){
        if(node1==null) return node2;
        if(node2==null) return node1;
        if(node1.val<=node2.val){
            node1.next = merge(node1.next,node2);
            return  node1;
        }else{
            node2.next = merge(node1,node2.next);
            return node2;
        }
    }
}
