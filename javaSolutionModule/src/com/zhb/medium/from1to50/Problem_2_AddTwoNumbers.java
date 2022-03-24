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
 * debug记录 ：
 * 一：超出内存限制 。 debug:写漏 l1 = l1.next;l2 = l2.next;
 * 二：WRONG 14 / 1568 个通过测试用例 。 debug：最后的if笔误写成了carryBit == 1
 * 三：WRONG 46 / 1568 个通过测试用例。debug：tempSum写漏了carryBit
 * 四：AC
 */
public class Problem_2_AddTwoNumbers {

    Solution solution = new Solution();
    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {// [2,4,3] [5,6,4]
            ListNode sentry = new ListNode(-1, null); //哨兵
            ListNode pointer = sentry;
            int carryBit = 0;
            ListNode toAddNode = null;
            while(l1!= null && l2!=null ) {
                int tempSum = l1.val+ l2.val + carryBit ;
                carryBit = tempSum / 10;
                toAddNode = new ListNode(tempSum % 10 ,null);
                pointer.next = toAddNode;
                pointer = toAddNode;
                l1 = l1.next;
                l2 = l2.next;
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
                    int tempSum = carryBit + l2.val ;
                    carryBit = tempSum / 10;
                    toAddNode = new ListNode(tempSum % 10 ,null);
                    pointer.next = toAddNode;
                    pointer = toAddNode;
                    l2 = l2.next;

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
                    int tempSum = carryBit + l1.val ;
                    carryBit = tempSum / 10;
                    toAddNode = new ListNode(tempSum % 10 ,null);
                    pointer.next = toAddNode;
                    pointer = toAddNode;
                    l1 = l1.next;
                }
            }

             if(carryBit == 1) {
                    pointer.next =new ListNode(carryBit ,null);
                    return sentry.next;
                }
            return sentry.next;
        }
    }


    @Test
    public void test1(){
       // [2,4,3] [5,6,4]
        ListNode l13 = new ListNode(3,null);
        ListNode l12 = new ListNode(4,l13);
        ListNode l11 = new ListNode(2,l12);

        ListNode l23 = new ListNode(4,null);
        ListNode l22 = new ListNode(6,l23);
        ListNode l21 = new ListNode(5,l22);

        ListNode listNode = solution.addTwoNumbers(l11, l21);
        System.out.println(listNode.val+"\t" +listNode.next.val+"\t" + listNode.next.next.val);
    }
}
/**
 * 递归 链表 数学
 */