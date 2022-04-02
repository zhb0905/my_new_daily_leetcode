package com.zhb.simple.from501to550;

/**
 * @author zhb
 * @create 2022-04-01 1:41
 */

import com.zhb.mylocallib.TreeNode;

/**
 * 543. 二叉树的直径
 * 给定一棵二叉树，你需要计算它的直径长度。一棵二叉树的直径长度是任意两个结点路径长度中的最大值。这条路径可能穿过也可能不穿过根结点。
 */
public class Problem_543_DiameterOfBinaryTree {
    /**
     * 思路：maxDiameter(tree) = max { maxDiameter(leftSubTree), maxDiameter(RightSubTree), leftHeight + 2 + rightHeight}
     *
     * debug记录：一：AC
     */
    class Solution {
        public int diameterOfBinaryTree(TreeNode root) {
            return maxDiameter(root);
        }
        public int maxDiameter(TreeNode root) {//root.val存高度
            if(root == null) {
                return 0;
            }
            if(root.left == null && root.right == null) {
                root.val = 0;
                return 0;
            }
            if(root.left == null) {
                int rightMax = maxDiameter(root.right);
                root.val = root.right.val + 1;
                return Math.max(root.val, rightMax);
            }
            if(root.right == null) {
                int leftMax = maxDiameter(root.left);
                root.val = root.left.val + 1;
                return Math.max(root.val, leftMax);
            }
            if (root.left != null && root.right != null){
                int leftMax =maxDiameter(root.left);
                int rightMax = maxDiameter(root.right);
                root.val = Math.max(root.left.val, root.right.val) + 1;
                return Math.max(Math.max(leftMax,rightMax), root.left.val + 1 + root.right.val + 1 );
            }
            return 0;
        }

    }

}
/**
 * 树 dfs 二叉树
 */