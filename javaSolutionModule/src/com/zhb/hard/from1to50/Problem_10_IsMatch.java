package com.zhb.hard.from1to50;

/**
 * @author zhb
 * @create 2022-03-26 21:20
 */

/**
 * 10. 正则表达式匹配
 * 给你一个字符串 s 和一个字符规律 p，请你来实现一个支持 '.' 和 '*' 的正则表达式匹配。
 *
 * '.' 匹配任意单个字符
 * '*' 匹配零个或多个前面的那一个元素
 * 所谓匹配，是要涵盖 整个 字符串 s的，而不是部分字符串。
 */
public class Problem_10_IsMatch {
    /**
     * 思路：
     * 一：标准化 p : aa*a...abb*bc -> a*b*c1 ，
     *    标准化 s : aaabbc -> a3b2c1
     * 二：每个 .* , 切割一次 p: p -> p1,p2,..pn
     * 三：检查p1,p2,..pn 能否按序无相交 匹配 s 子串
     * p1,p2,..pn组合太多，不考虑。
     *
     */
    /**
     * 思路二：状态DP：isMatch[i][j] === isMatch(s.subString(0,i), p.subString(0,j))
     */
    class Solution {
        public boolean isMatch(String s, String p) {
            //todo: 标准化p
            return false;
        }
        public boolean isStandardMatch(String s, String p) {
            int sLength = s.length();
            int pLength = p.length();
            //todo:
            return false;
        }
    }
}
