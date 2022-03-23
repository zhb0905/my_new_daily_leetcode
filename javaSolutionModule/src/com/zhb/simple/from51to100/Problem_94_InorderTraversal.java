package com.zhb.simple.from51to100;

import com.zhb.mylocallib.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhb
 * @create 2022-03-24 7:09
 */

/**
 * 94. 二叉树的中序遍历
 */
public class Problem_94_InorderTraversal {
    //递归版本
    class Solution {
        List<Integer> list = new ArrayList<>();
        public List<Integer> inorderTraversal(TreeNode root) {
            inOrderSearch(root);
            return list;
        }
        public void inOrderSearch(TreeNode treeNode){
            if(treeNode == null) {
                return;
            }

            inOrderSearch(treeNode.left);
            list.add(treeNode.val);
            inOrderSearch(treeNode.right);

        }

    }
    //todo:迭代版本
}

/**
 * 栈 树 深度优先  二叉树
 */