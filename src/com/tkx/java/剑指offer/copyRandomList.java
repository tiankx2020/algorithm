package com.tkx.java.剑指offer;

import java.util.HashMap;

/**
 * @Description: 复杂链表的复制
 * @author: scott
 * @date: 2022年05月11日 18:26
 */
public class copyRandomList {
    // public Node copyRandomList(Node head) {
    //     if(head == null) return null;
    //     Node cur = head;
    //     Map<Node,Node> map = new HashMap<Node,Node>();
    //     while (cur!=null){
    //         map.put(cur,new Node(cur.val));
    //         cur = cur.next;
    //     }
    //     cur = head;
    //     while (cur!=null){
    //         map.get(cur).next = map.get(cur.next);
    //         map.get(cur).random = map.get(cur.random);
    //         cur = cur.next;
    //     }
    //     return  map.get(head);
    // }
}
