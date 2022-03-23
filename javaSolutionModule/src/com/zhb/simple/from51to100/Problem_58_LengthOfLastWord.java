package com.zhb.simple.from51to100;

/**
 * @author zhb
 * @create 2022-03-24 3:16
 */

/**
 * 58. 最后一个单词的长度
 *
 * 给你一个字符串 s，由若干单词组成，单词前后用一些空格字符隔开。返回字符串中 最后一个 单词的长度。
 *
 * 单词 是指仅由字母组成、不包含任何空格字符的最大子字符串。
 *
 *  
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/length-of-last-word
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Problem_58_LengthOfLastWord {
    class Solution {
        // 手动 : 去尾空格，倒序查找
        public int lengthOfLastWord(String s) {
/*       AC:     String[] split = s.stripTrailing().split("\s+");
            return split[split.length - 1].length();*/
            String s1 = s.stripTrailing();
            int lastIndexOfSpace = s1.lastIndexOf(" ");
            return s1.length() - 1 - lastIndexOfSpace;

        }

    }
}

/**
 * 标签 ： 字符串
 */