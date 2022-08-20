package com.tkx.java.牛客top100.二叉树;

import com.tkx.java.剑指offer.TreeNode;

/**
 step 1：两种方向的前序遍历，同步过程中的当前两个节点，同为空，属于对称的范畴。
 step 2：当前两个节点只有一个为空或者节点值不相等，已经不是对称的二叉树了。
 step 3：第一个节点的左子树与第二个节点的右子树同步递归对比，第一个节点的右子树与第二个节点的左子树同步递归比较。
 */
public class BM31对称的二叉树 {
    boolean isSymmetrical(TreeNode pRoot) {
        return  pRoot==null ||judge(pRoot.left,pRoot.right);
    }

    public boolean judge(TreeNode node1,TreeNode node2){
        if(node1==null && node2==null) return true;
        if(node1==null || node2==null) return false;
        if(node1.val!=node2.val) return false;
        return judge(node1.left,node2.right) && judge(node1.right,node2.left);
    }
}
