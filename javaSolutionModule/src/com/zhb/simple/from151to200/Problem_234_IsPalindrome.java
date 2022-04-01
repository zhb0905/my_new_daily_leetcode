package com.zhb.simple.from151to200;

/**
 * @author zhb
 * @create 2022-04-01 1:37
 */

import com.zhb.mylocallib.ListNode;



/**
 * 234. 回文链表
 * 给你一个单链表的头节点 head ，请你判断该链表是否为回文链表。如果是，返回 true ；否则，返回 false 。
 *
 * 进阶：你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？
 */
public class Problem_234_IsPalindrome {
    /**
     * 描述：判断回文
     * 思路：反转 + 快慢指针
     *
     * 思路二：尝试采用递归： 利用递归调用栈的弹栈顺序当作倒序遍历
     *
     * debug记录：一：AC
     */
    class Solution {
        public ListNode toCheck;
        public boolean isPalindrome(ListNode head) {
            toCheck = head;
            return recursiveCheck(head);
        }
        public boolean recursiveCheck(ListNode listNode) {// return : listNode至tail  是否和  head至...  轴对称
            //压栈顺序，表头到表尾
            if(listNode != null) {
                if (! recursiveCheck(listNode.next)) {//通过弹栈：倒序遍历
                    return false;
                }
                if (listNode.val == toCheck.val) {
                    //通过toCheck顺序遍历
                    toCheck = toCheck.next;
                    return true;
                } else {
                    return false;
                }

            }
            return true;
        }
    }
}
/**
 * 递归 链表 双指针 栈
 */