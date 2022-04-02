package com.zhb.simple.from151to200;

/**
 * @author zhb
 * @create 2022-04-01 1:36
 */

import com.zhb.mylocallib.ListNode;

/**
 * 206. 反转链表
 * 给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
 *
 */
public class Problem_206_ReverseList {
    /**
     * 描述：反转链表
     * 思路：遍历的同时改引用的方向
     * debug记录： 一：AC
     */
    class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode traversalPointer = head;   //遍历指针
            ListNode previousListNode = head;   //遍历指针的前一个结点
            if (head == null || head.next == null) {
                return head;
            }
            //init
            traversalPointer = head.next;
            head.next = null;
            ListNode tempListNode = null;//临时存traversalPointer
            while (traversalPointer != null ) {//状态,断言： listNodes <-- previousListNode  traversalPointer --> listNodes
                tempListNode = traversalPointer;
                traversalPointer = traversalPointer.next;
                tempListNode.next = previousListNode;
                previousListNode = tempListNode;
            }
            return previousListNode;
        }
    }
}
/**
 * 递归 链表
 */