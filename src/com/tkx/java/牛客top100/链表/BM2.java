package com.tkx.java.牛客top100.链表;

import com.tkx.java.ListNode;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月17日 20:25
 */
public class BM2 {
    public ListNode reverseBetween (ListNode head, int m, int n) {
        int index = 0 ;
        ListNode p = head,pre=null,tail=null,q;
        ListNode site = new ListNode(-1);
        site.next = head;
        p = site;
        while(p!=null){
            index++;
            if(index==m){
                pre = p;
            }
            if(index==n){
                tail = p.next.next;
                break;
            }
            p = p.next;
        }
//         System.out.println(pre.val);
//         System.out.println(tail.val);
        p = pre.next;
        q = p.next;
        p.next=tail;
        index = m;
        while (index<n){
            ListNode next = q.next;
            q.next = p;
            p=q;
            q= next;
            index++;
        }
        pre.next = p;
        return site.next;
    }
}
