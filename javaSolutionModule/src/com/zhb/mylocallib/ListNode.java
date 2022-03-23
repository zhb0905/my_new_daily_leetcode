package com.zhb.mylocallib;

/**
 * @author zhb
 * @create 2022-03-24 6:28
 */

/**
 * 单链表，同leetcode
 */
public class ListNode {
    public int val;
    public  ListNode next;

    public ListNode() {
    }

    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}