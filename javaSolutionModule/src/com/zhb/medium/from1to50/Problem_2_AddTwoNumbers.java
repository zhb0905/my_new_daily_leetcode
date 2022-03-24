package com.zhb.medium.from1to50;

/**
 * @author zhb
 * @create 2022-03-24 7:55
 */

import com.zhb.mylocallib.ListNode;
import org.junit.Test;


/**
 * 2. 两数相加
 * 给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
 *
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 *
 * 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-two-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

/**
 * BigInteger
 */
public class Problem_2_AddTwoNumbers {
    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode sentry = new ListNode(-1, null); //哨兵
            ListNode pointer = sentry;
            int carryBit = 0;
            ListNode toAddNode = null;
            while(l1!= null && l2!=null ) {
                int tempSum = l1.val+ l2.val ;
                carryBit = tempSum / 10;
                toAddNode = new ListNode(tempSum % 10 ,null);
                pointer.next = toAddNode;
                pointer = toAddNode;
            }
            if(l1 == null) {
                /*if(carryBit == 0) {
                    pointer.next =l2;
                    return sentry.next;
                }*/
                while (l2 != null) {
                    if (carryBit == 0 ) {
                        pointer.next = l2 ;
                        return sentry.next;
                    }
                    int tempSum = 1 + l2.val ;
                    carryBit = tempSum / 10;
                    toAddNode = new ListNode(tempSum % 10 ,null);
                    pointer.next = toAddNode;
                    pointer = toAddNode;

                }
            }

            if(l2 == null) {
                /*if(carryBit == 0) {
                    pointer.next =l2;
                    return sentry.next;
                }*/
                while (l1 != null) {
                    if (carryBit == 0 ) {
                        pointer.next = l1 ;
                        return sentry.next;
                    }
                    int tempSum = 1 + l1.val ;
                    carryBit = tempSum / 10;
                    toAddNode = new ListNode(tempSum % 10 ,null);
                    pointer.next = toAddNode;
                    pointer = toAddNode;

                }
            }

             if(carryBit == 0) {
                    pointer.next =new ListNode(1 ,null);
                    return sentry.next;
                }
            return sentry.next;
        }
    }

}
