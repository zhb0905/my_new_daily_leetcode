package com.zhb.simple.from51to100;


import com.zhb.mylocallib.ListNode;

/**
 * @author zhb
 * @create 2022-03-24 6:26
 */

public class Problem_83_DeleteDuplicates {

    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            int toCompareWith = -101;
            ListNode slow = new ListNode();
            ListNode fast = head;
            while (fast!= null){
                while (fast!=null && fast.val == toCompareWith) {
                    fast = fast.next;
                }
                if (fast == null) {
                    slow.next = null;
                    break;
                }
                slow.next = fast;
                slow = fast;
                toCompareWith = slow.val;
                fast = fast.next;

            }
            return head;
        }
    }
}
/**
 *  链表
 */