package com.tkx.java.牛客top100.二叉树;

import com.tkx.java.剑指offer.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月17日 22:54
 */
public class BM27按之字形顺序打印二叉树 {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (pRoot == null) return list;
        queue.add(pRoot);
        int height = 0;
        while (!queue.isEmpty()) {
            ArrayList<Integer> tmp = new ArrayList<>();
            for (int i = queue.size(); i > 0; i--) {
                TreeNode t = queue.poll();
                tmp.add(t.val);
                if (t.left != null) {
                    queue.add(t.left);
                }
                if (t.right != null) {
                    queue.add(t.right);
                }
            }
            height++;
            if (height % 2 == 0) {
                Collections.reverse(tmp);
            }
            list.add(tmp);
        }
        return list;
    }
}
