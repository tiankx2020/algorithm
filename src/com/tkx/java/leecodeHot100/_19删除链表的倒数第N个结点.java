package com.tkx.java.leecodeHot100;

import com.tkx.java.ListNode;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月16日 20:23
 */
public class _19删除链表的倒数第N个结点 {
    //第一种答案
    // ListNode pre;
    // int index=0;
    // public ListNode removeNthFromEnd(ListNode head, int n) {
    //     dfs(head,n);
    //     if(pre==null) return head.next;
    //     pre.next = pre.next.next;
    //     return head;
    // }
    //
    // public void dfs(ListNode head,int n){
    //     if(head!=null){
    //         dfs(head.next,n);
    //         index++;
    //         if(index==n+1){
    //             pre = head;
    //         }
    //     }
    // }

    //第二种答案
    //思路：先计算链表的长度len，然后找到第len-n个结点index,如果index==0 直接return head.next;
    //else 找到index对应的结点node ,删除其后继结点
    // public ListNode removeNthFromEnd(ListNode head, int n) {
    //     int len = 0;
    //     ListNode p = head;
    //     while (p!=null){
    //         p=p.next;
    //         len++;
    //     }
    //     int index = len-n;
    //     if(index==0) return head.next;
    //     p = head;
    //     while (index>1){
    //         p=p.next;
    //         index--;
    //     }
    //     p.next = p.next.next;
    //     return head;
    // }

    //第三种答案
    //让一个指针q先走n步
    //之后两个指针p,q一起走
    //如果q为空直接返回head.next;
    //否则当q.next时，删除要删除的结点，并返回head
    // public ListNode removeNthFromEnd(ListNode head, int n) {
    //     ListNode p = head, q = head;
    //     while (n > 0) {
    //         q = q.next;
    //         n--;
    //     }
    //     if (q == null) return head.next;
    //     while (q.next != null) {
    //         p = p.next;
    //         q = q.next;
    //     }
    //     p.next = p.next.next;
    //     return head;
    // }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p = head, q = head;
        while (n > 0) {
            q = q.next;
            n--;
        }
        if (q == null) return head;
        while (q.next!=null){
            p=p.next;
            q=q.next;
        }
        p.next = p.next.next;
        return head;
    }
}
