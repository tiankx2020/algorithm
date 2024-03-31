package com.tkx.java.每日一题;

import com.tkx.java.TreeNode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @Author tkx
 * @Date 2024 03 12
 **/
public class FindElements {
    TreeNode rootNode;
    Set<Integer> set = new HashSet<>();
    public FindElements(TreeNode root) {
        this.rootNode = root;
        if(root!=null) root.val =0;
        buildTree(root);
    }

    public boolean find(int target) {
        return  fundVal(target);
    }

    public void buildTree(TreeNode node){
        if(node !=null){
            set.add(node.val);
            if(node.left!=null){
                node.left.val = 2*node.val+1;
            }
            if(node.right!=null){
                node.right.val = 2*node.val+2;
            }
            buildTree((node.left));
            buildTree((node.right));
        }
    }

    public boolean fundVal(int target){
        return set.contains(target);
    }
}
