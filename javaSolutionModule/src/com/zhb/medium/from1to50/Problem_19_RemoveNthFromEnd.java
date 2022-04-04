package com.zhb.medium.from1to50;

/**
 * @author zhb
 * @create 2022-03-26 23:17
 */

import com.zhb.mylocallib.ListNode;

/**
 * 19. 删除链表的倒数第 N 个结点
 * 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 * 进阶：你能尝试使用一趟扫描实现吗？
 */
public class Problem_19_RemoveNthFromEnd {
    /**
     * 思路：
     * 距离为 n 的双指针
     *
     * debug记录：一：AC
     */
    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            //首指针先走 n + 1 步
            //边界：倒数第n个是头结点
            ListNode firstPointer = head;
            ListNode secondpointer = head;
            for (int i = 0; i < n; i++) {
                firstPointer = firstPointer.next;
            }
            if (firstPointer == null) {
                return head.next;
            }
            //第 n + 1 步
            firstPointer = firstPointer.next;
            while (firstPointer != null)  {
                firstPointer = firstPointer.next;
                secondpointer = secondpointer.next;
            }
            secondpointer.next = secondpointer.next.next;
            return head;
        }
    }
}

/**
 * 链表 双指针 栈
 */