package com.zhb.simple.from101to150;

/**
 * @author zhb
 * @create 2022-03-31 23:03
 */

import com.zhb.mylocallib.ListNode;

/**
 * 141. 环形链表
 * 给你一个链表的头节点 head ，判断链表中是否有环。
 *
 * 如果链表中有某个节点，可以通过连续跟踪 next 指针再次到达，则链表中存在环。 为了表示给定链表中的环，评测系统内部使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。注意：pos 不作为参数进行传递 。仅仅是为了标识链表的实际情况。
 *
 * 如果链表中存在环 ，则返回 true 。 否则，返回 false 。
 * 进阶：你能用 O(1)（即，常量）内存解决此问题吗？
 */
public class Problem_141_HasCycle {
    /**
     * 描述：判断单链表有无环
     * 思路：龟兔赛跑（Floyd判圈），step:2,1
     * debug记录：一：AC
     */
    public class Solution {
        public boolean hasCycle(ListNode head) {
            if(head == null || head.next == null ) {
                return false;
            }
            ListNode slow = head;
            ListNode fast = head.next;
            while(slow != fast) {
                if(fast.next == null) {
                    return false;
                }
                if(fast.next.next == null) {
                    return false;
                }
                fast = fast.next.next;
                slow = slow.next;
            }
            return slow == fast;
        }
    }
}
/**
 * 哈希表，链表，双指针
 */