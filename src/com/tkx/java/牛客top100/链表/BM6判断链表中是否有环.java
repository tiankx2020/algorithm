package com.tkx.java.牛客top100.链表;

import com.tkx.java.ListNode;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月17日 21:04
 */
public class BM6判断链表中是否有环 {
    public boolean hasCycle(ListNode head) {
        if(head == null) return true;
        ListNode p =head,q =head;
        while(q!=null && q.next!=null){
            p = p.next;
            q = q.next.next;
            if(p==q){
                return true;
            }
        }
        return false;
    }
}
