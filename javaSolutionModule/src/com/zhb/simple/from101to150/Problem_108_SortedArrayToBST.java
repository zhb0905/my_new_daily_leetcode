package com.zhb.simple.from101to150;

/**
 * @author zhb
 * @create 2022-03-26 18:26
 */

import com.zhb.mylocallib.TreeNode;

/**
 * 108. 将有序数组转换为二叉搜索树
 * 给你一个整数数组 nums ，其中元素已经按 升序 排列，请你将其转换为一棵 高度平衡 二叉搜索树。
 *
 * 高度平衡 二叉树是一棵满足「每个节点的左右两个子树的高度差的绝对值不超过 1 」的二叉树。
 */
public class Problem_108_SortedArrayToBST {
    class Solution {
        public TreeNode sortedArrayToBST(int[] nums) {
            return RecursiveToBST(nums, 0, nums.length);
        }
        public TreeNode RecursiveToBST(int[] nums, int start, int end) {
            if(end <= start ) {
                return null;
            }
            int middle = (start + end) / 2;
            TreeNode treeNode = new TreeNode(nums[middle], null, null);
            treeNode.left = RecursiveToBST(nums,start,middle);
            treeNode.right = RecursiveToBST(nums,middle+1,end);
            return treeNode;
        }
    }
}
/**
 * 树 二叉搜索树 数组 分治 二叉树
 */