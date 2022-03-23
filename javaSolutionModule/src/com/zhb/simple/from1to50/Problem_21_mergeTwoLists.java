package com.zhb.simple.from1to50;

/**
 * @author zhb
 * @create 2022-03-23 20:56
 */

/**
 * 21. 合并两个有序链表
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 * 标签 ： 递归  链表
 */

import com.zhb.mylocallib.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */



public class Problem_21_mergeTwoLists {
    class Solution {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {//尾插
            ListNode tail = null;//尾空指针
            ListNode head = new ListNode(-1, tail);//哨兵
            ListNode pointer = head;
            while (list1 != null && list2 != null) {
                if (list1.val >= list2.val) {
                    ListNode temp = new ListNode(list2.val, tail);
                    pointer.next = temp;
                    pointer = temp;
                    list2 = list2.next;
                }
                else if (list1.val < list2.val) {
                    ListNode temp = new ListNode(list1.val, tail);
                    pointer.next = temp;
                    pointer = temp;
                    list1 = list1.next;
                }
            }
            if(list1 == null) {
                pointer.next =list2;
            } else {
                pointer.next = list1;
            }
            return head.next;

        }
    }
}
