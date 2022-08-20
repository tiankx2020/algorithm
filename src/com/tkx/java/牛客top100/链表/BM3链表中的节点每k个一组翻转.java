package com.tkx.java.牛客top100.链表;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月17日 20:42
 */
public class BM3链表中的节点每k个一组翻转 {
    // public ListNode reverseKGroup(ListNode head, int k) {
    //     //找到下一次反转的头节点
    //     ListNode tail = head;
    //     for (int i = 0; i < k; i++) {
    //         if(tail==null){
    //             return head;
    //         }
    //         tail = tail.next;
    //     }
    //
    //     ListNode pre = null;
    //     ListNode cur = head;
    //     while(cur!=tail){
    //         ListNode next = cur.next;
    //         cur.next = pre;
    //         pre= cur;
    //         cur = next;
    //     }
    //     head.next = reverseKGroup(tail,k);
    //     return  pre;
    // }
}
