package com.zhb.simple.from51to100;

/**
 * @author zhb
 * @create 2022-03-24 6:49
 */

/**
 * 你可以设计实现一个时间复杂度为 O(m + n) 的算法解决此问题吗？
 *
 */
public class Problem_84_Merge {
    class Solution {
        //归并
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int i=0,j=0;
            if (n>0) {
                for (int k = m-1; k >=0; k--) {
                    nums1[k+n] = nums1[k];
                    nums1[k] = 0;

                }
            }

            while (i<m && j<n) {
                if(nums1[i+n] <= nums2[j]) {
                    nums1[i+j] =nums1[i+n];
                    i++;
                }
                else {
                    nums1[i+j] = nums2[j];
                    j++;
                }
            }
            if(i == m) {
                while(j<n){
                    nums1[i+j] = nums2[j];
                    j++;
                }
            }
            if(j== n) {
                while(i<m){
                    nums1[i+j] = nums1[i+n];
                    i++;
                }
            }

        }
    }

}
/**
 *  数组 双指针  排序
 *
 */