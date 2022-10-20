package com.tkx.java.热点题目;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年09月13日 11:21
 */
public class LRU缓存 {
    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(2);
        lruCache.put(2,1);
        lruCache.put(3,2);
        System.out.println(lruCache.get(3));
        System.out.println(lruCache.get(2));
        lruCache.put(4,3);
        System.out.println(lruCache.get(2));
        System.out.println(lruCache.get(3));
        System.out.println(lruCache.get(4));
    }
    Map<Integer, ListNode> map = new HashMap<>();
    int capacity;
    ListNode head = new ListNode();
    ListNode tail = new ListNode();
    public LRU缓存(int capacity) {
        this.capacity = capacity;
        head.next = tail;
        tail.pre = head;
    }

    public int get(int key) {
        ListNode node = map.get(key);
        if(node==null) return -1;
        deleteNode(node);
        addNode(node);
        return node.val;
    }

    public void put(int key, int value) {
        ListNode node = map.get(key);
        if(node==null){
            ListNode listNode = new ListNode(key, value);
            addNode(listNode);
            map.put(key,listNode);
            // put之后如果大于最大容量
            if(map.size()>capacity){
                int tmp = tail.pre.key;
                deleteNode(tail.pre);
                map.remove(tmp);
            }
        }else{
            node.val = value;
            deleteNode(node);
            addNode(node);
        }
    }

    public void deleteNode(ListNode node){
        node.pre.next = node.next;
        node.next.pre  = node.pre;
    }

    public void addNode(ListNode node){
        node.next = head.next;
        node.pre = head;
        head.next.pre= node;
        head.next = node;
    }

}
