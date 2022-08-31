package com.tkx.java.dongboy.tuhu;

import java.util.HashSet;
import java.util.Set;

/**
 * @author dong boy
 * @date 2022年08月31日 19:51
 */
public class One {
    static Set<Integer> set = new HashSet<>();

    public int numColor(TreeNode root) {
        one(root);
        return set.size();
    }

    public void one(TreeNode root) {
        if (root == null) {
            return;
        }
        set.add(root.val);
        one(root.left);
        one(root.right);
    }
}

class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
