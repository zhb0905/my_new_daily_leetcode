package com.zhb.medium.from1to50;

/**
 * @author zhb
 * @create 2022-03-24 20:57
 */

import java.util.HashSet;
import java.util.Set;

/**
 * 3. 无重复字符的最长子串
 * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
 */


public class Problem_3_LengthOfLongestSubstring {
    /**
     * 思路：滑动窗口[left,right)。right前进条件；right 不重复。
     * left前进条件: right (重复)
     *
     * debug记录：
     * 一：WRONG java.lang.StringIndexOutOfBoundsException: String index out of range: line 54
     *          left溢出， debug: line38 -:<  +:<=
     * 二：AC
     */
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            if(s == null || s.length() == 0) {
                return 0;
            }
            int left = 0;
            int right = 1;
            Set<Character> set = new HashSet<>();
            set.add(s.charAt(0));
            int longest = 1;
            while(left< s.length()) {
                while(right <= s.length()) {
                    if(right == s.length()) {
                        longest = Math.max(longest,right-left);
                        return longest;
                    }
                    if (!set.contains(s.charAt(right))) {
                        set.add(s.charAt(right));
                        right++;
                        continue;
                    }
                    if (set.contains(s.charAt(right))){
                        longest = Math.max(longest,right-left);
                        break;
                    }

                }
                while (set.contains(s.charAt(right))) {
                    set.remove(s.charAt(left));
                    left++;
                }
            }
            return longest;
        }
    }
}
/**
 * 哈希表 字符串  滑动窗口
 */