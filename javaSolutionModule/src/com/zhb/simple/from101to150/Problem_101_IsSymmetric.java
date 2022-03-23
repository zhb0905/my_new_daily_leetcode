package com.zhb.simple.from101to150;

import com.zhb.mylocallib.TreeNode;

/**
 * @author zhb
 * @create 2022-03-24 7:37
 */
public class Problem_101_IsSymmetric {
    //递归：两棵对称树的子树的对称性
    class Solution {
        public boolean isSymmetric(TreeNode root) {
            if (root == null) {
                return true;
            }
            return isTwoTreeSymmetric(root.left,root.right);
        }
        public boolean isTwoTreeSymmetric(TreeNode treeNode1, TreeNode treeNode2) {
            if (treeNode1 == null && treeNode2 ==null) {
                return true;

            }
            if (treeNode1 == null || treeNode2 == null) {
                return false;
            }
            if (treeNode1.val != treeNode2.val) {
                return false;
            }
            return isTwoTreeSymmetric(treeNode1.left, treeNode2.right) && isTwoTreeSymmetric(treeNode1.right,treeNode2.left);
        }
    }
}
/**
 *  树 DFS BFS 二叉树
 */