package com.tkx.java.秋招笔试题.小米;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Node {
    public int data;
    public Node left;
    public Node right;

    public Node(int data) {
        this.data = data;
    }

    public Node() {
    }

    public Node(int data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}

class Solution {

    /* Write Code Here */
    Node p =null, h =null;
    public Node  Convert(Node pRootOfTree) {
        dfs(pRootOfTree);
        if(p!=null){
            p.right = h;
            h.left = p;
        }
        return h;
    }

    public void dfs(Node listNode){
        if(listNode !=null){
            dfs(listNode.left);
            if(p==null){
                p = listNode;
                h = listNode;
            }else{
                p.right = listNode;
                listNode.left = p;
            }
            p = listNode;
            dfs(listNode.right);
        }
    }
}

 class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Node res = null;
        List<Node> list = new ArrayList<>();

        while (in.hasNext()) {
            int item = in.nextInt();
            if (item == -1) {
                list.add(null);
            } else {
                list.add(new Node(item));
            }
        }
        int len = list.size();
        int i = 0;
        while (i <= (len - 2) / 2) {
            if (2 * i + 1 < len && list.get(i) != null) {
                list.get(i).left = list.get(2 * i + 1);
            }
            if (2 * i + 2 < len && list.get(i) != null) {
                list.get(i).right = list.get(2 * i + 2);
            }
            i++;
        }

        res = new Solution().Convert(list.get(0));
        if (res != null) {
            while (res.right != null && res.data != -1) {
                System.out.print(String.valueOf(res.data) + " ");
                res = res.right;
            }
            System.out.print(res.data + " ");
            while (res.left != null && res.data != -1) {
                System.out.print(String.valueOf(res.data) + " ");
                res = res.left;
            }
            System.out.print(res.data);
        }
        System.out.println();
    }
}
