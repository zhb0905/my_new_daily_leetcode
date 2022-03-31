package com.zhb.simple.from151to200;

import com.zhb.mylocallib.ListNode;

/**
 * @author zhb
 * @create 2022-04-01 0:45
 */

/**
 * 160. 相交链表
 * 给你两个单链表的头节点 headA 和 headB ，请你找出并返回两个单链表相交的起始节点。如果两个链表不存在相交节点，返回 null 。
 *
 * 图示两个链表在节点 c1 开始相交：
 *
 *
 *
 * 题目数据 保证 整个链式结构中不存在环。
 *
 * 注意，函数返回结果后，链表必须 保持其原始结构 。
 *
 * 自定义评测：
 *
 * 评测系统 的输入如下（你设计的程序 不适用 此输入）：
 *
 * intersectVal - 相交的起始节点的值。如果不存在相交节点，这一值为 0
 * listA - 第一个链表
 * listB - 第二个链表
 * skipA - 在 listA 中（从头节点开始）跳到交叉节点的节点数
 * skipB - 在 listB 中（从头节点开始）跳到交叉节点的节点数
 * 评测系统将根据这些输入创建链式数据结构，并将两个头节点 headA 和 headB 传递给你的程序。如果程序能够正确返回相交节点，那么你的解决方案将被 视作正确答案 。
 *
 * 进阶：你能否设计一个时间复杂度 O(m + n) 、仅用 O(1) 内存的解决方案？
 */
public class Problem_160_GetIntersectionNode {
    /**
     * 描述：Y型找交点
     * 思路：A链走A+B，B链走B+A；则首次相交于交点
     *
     * debug记录：一：AC
     *
     */
    public class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            ListNode APointer = headA;
            ListNode BPointer = headB;
            while (APointer != BPointer) {//不相交时：经过A+B轮，null = APointer = BPointer ;
                APointer = (APointer == null) ? headB : APointer.next;
                BPointer = (BPointer == null) ? headA : BPointer.next;
            }

            return APointer;
        }
    }
}
/**
 * 哈希表 链表 双指针
 */