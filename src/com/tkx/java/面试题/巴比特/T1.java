package com.tkx.java.面试题.巴比特;

import com.tkx.java.TreeNode;
import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月17日 10:00
 */
public class T1 {



    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int min = Math.min(p.val,q.val);
        int max = Math.max(p.val, q.val);
        while (root!=null){
            if(root.val>=min && root.val<=max) return root;
            else if(root.val<min ) root = root.left;
            else root = root.right;
        }
        return null;
    }
}
