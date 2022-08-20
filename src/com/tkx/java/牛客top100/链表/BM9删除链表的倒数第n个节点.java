package com.tkx.java.牛客top100.链表;

import com.tkx.java.ListNode;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月17日 21:24
 */
public class BM9删除链表的倒数第n个节点 {
    int index = 0;
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode node = new ListNode(-1);
        node.next = head;
        return  node.next;
    }

    public  void dfs(ListNode head,int n){
        if(head!=null){
            dfs(head.next,n);
            if(index == n){
                System.out.println(head.val);
                head.next = head.next.next;
            }
            index++;
        }
    }
}
