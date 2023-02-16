package com.tkx.java.秋招笔试题.阅文集团;

import com.tkx.java.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年11月01日 19:35
 */
public class T2 {
    public int findBottomLeftValue(TreeNode root) {
        // write code here
        int res = -1;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int size = queue.size(); size > 0; size--) {
                TreeNode tmp = queue.poll();
                if (size == len) {
                    res = tmp.val;
                }
                if (tmp.left != null) {
                    queue.add(tmp.left);
                }
                if (tmp.right != null) {
                    queue.add(tmp.right);
                }
            }
        }
        return res;
    }

}
