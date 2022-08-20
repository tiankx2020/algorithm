package com.tkx.java.每日一题;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月08日 16:23
 */
public class N叉树的层序遍历 {
    public List<List<Integer>> levelOrder(Node root) {
        Queue<Node> queue = new LinkedList<>();
        List<List<Integer>> list = new ArrayList<>();
        if(root!=null) queue.add(root);
        while(!queue.isEmpty()){
            List<Integer> tmp = new ArrayList<>();
            for(int i=queue.size();i>0;i--){
                Node t = queue.poll();
                tmp.add(t.val);
                for (Node child : t.children) {
                    queue.add(child);
                }
            }
            list.add(new ArrayList<>(tmp));
        }
        return list;
    }
}

// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
