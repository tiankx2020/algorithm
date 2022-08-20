package com.tkx.java.牛客top100.链表;

import com.tkx.java.ListNode;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月17日 21:07
 */
public class BM7链表中环的入口结点 {
    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if(pHead == null || pHead.next == null)
            return null;
        ListNode p1 = pHead;
        ListNode p2 = pHead;
        while(p2 != null && p2.next != null ){
            p1 = p1.next;
            p2 = p2.next.next;
            if(p1 == p2){
                /*第二步，找环的入口。接上步，当p1==p2时，p2所经过节点数为2x,p1所经过节点数为x,
                设环中有n个节点,p2比p1多走一圈有2x=n+x;
                n=x;可以看出p1实际走了一个环的步数，再让p2指向链表头部，
                p1位置不变，p1,p2每次走一步直到p1==p2;此时p1指向环的入口。
                * */
                p2 = pHead;
                while(p1 != p2){
                    p1 = p1.next;
                    p2 = p2.next;
                }
                // if(p1 == p2)
                return p1;
            }
        }
        return null;
    }
}
