package com.zhb.hard.from1to50;

/**
 * @author zhb
 * @create 2022-03-25 21:36
 */


/**
 * 4. 寻找两个正序数组的中位数
 * 给定两个大小分别为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的 中位数 。
 *
 * 算法的时间复杂度应该为 O(log (m+n)) 。
 *
 *
 */
public class Problem_4_FindMedianSortedArrays {
    private Solution solution = new Solution();
    /**
     * 思路：二分查找 ,每次查找两个 (m+n)/4 位置,
     *
     */
    class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int length1 = nums1.length;
            int length2 = nums2.length;
            if ((length1 + length2) % 2 == 1) {
                return findKth(nums1, nums2, (length1 + length2 + 1) / 2);
            } else {
                return (findKth(nums1, nums2, (length1 + length2 + 1) / 2) + findKth(nums1, nums2, (length1 + length2 + 3) / 2)) / 2;
            }
        }
        public double findKth(int[] nums1, int[]nums2 ,int kth) {
            int length1 = nums1.length;
            int length2 = nums2.length;
            int smallerConfirmed = 0;
            int pointerNum1 = 0;
            int pointerNum2 = 0;
            int stepLength = 0;
            int nextPosition1;
            int nextPosition2;
            while (smallerConfirmed < kth) {
                if(pointerNum1 == length1) {
                    return nums2[pointerNum2+ kth - smallerConfirmed - 1];
                }
                if(pointerNum2 == length2) {
                    return nums1[pointerNum1+ kth - smallerConfirmed - 1];
                }
                if(kth - smallerConfirmed == 1) {
                    return Math.min(nums1[pointerNum1], nums2[pointerNum2]);
                }
                stepLength = (kth - smallerConfirmed) / 2;
                nextPosition1 = Math.min(pointerNum1 + stepLength - 1, length1 -1);
                nextPosition2 = Math.min(pointerNum2 + stepLength - 1, length2 -1);
                if (nums1[nextPosition1] >= nums2[nextPosition2]) {
                    smallerConfirmed += nextPosition2 - pointerNum2 + 1;
                    pointerNum2 = nextPosition2 + 1;


                } else if (nums1[nextPosition1] < nums2[nextPosition2]) {
                    smallerConfirmed += nextPosition1 - pointerNum1 + 1;
                    pointerNum1 = nextPosition1 + 1;
                }

            }
            return 0.0;
        }
    }
}

/**
 *  数组 二分查找 分治
 */