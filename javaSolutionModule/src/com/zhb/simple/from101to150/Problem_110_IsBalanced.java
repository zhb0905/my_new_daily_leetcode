package com.zhb.simple.from101to150;

/**
 * @author zhb
 * @create 2022-03-26 18:47
 */

import com.zhb.mylocallib.TreeNode;

/**
 * 110. 平衡二叉树
 * 给定一个二叉树，判断它是否是高度平衡的二叉树。
 *
 * 本题中，一棵高度平衡二叉树定义为：
 *
 * 一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1 。
 */


public class Problem_110_IsBalanced {
    /**
     * 思路：递归地求树高
     */
    /**
     * debug记录：
     * 一：AC
     */
    class Solution {
        public boolean isBalanced(TreeNode root) {
            int height = RecursiveHeight(root);
            return height != -1 ;
        }
        public int RecursiveHeight(TreeNode treeNode) {
            if(treeNode == null) {
                return 0;
            }
            int leftHeight = RecursiveHeight(treeNode.left);
            int rightHeight = RecursiveHeight(treeNode.right);
            int height = 0;
            if (leftHeight >= 0 && rightHeight >= 0 && Math.abs(leftHeight-rightHeight) <= 1) {
                height = Math.max(leftHeight,rightHeight)+1;
            } else {
                height = -1;
            }
            return height;
        }
    }
}

/**
 * 树 dfs 二叉树
 */