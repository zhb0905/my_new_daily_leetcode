package com.zhb.medium.from1to50;

/**
 * @author zhb
 * @create 2022-03-25 0:42
 */

/**
 * 5. 最长回文子串
 * 给你一个字符串 s，找到 s 中最长的回文子串。
 */

/**
 * 区间 DP 是在一个区间上进行的一系列的动态规划，在一个线性的数据上对区间进行状态转移，
 * dp[i][j]表示i到j的区间。dp[i][j]可以由子区间的状态转移而来，
 * 关键是 dp[i][j]表示什么，然后找 dp[i][j]和子区间的关系。 《大学生程序竞赛算法基础教程》
 */

/**
 * 线性DP是动态规划问题中的一类问题，指状态之间有线性关系的动态规划问题
 */


import org.junit.Test;
public class Problem_5_LongestPalindrome {

    private Solution solution = new Solution();
    /**
     * 思路：区间DP
     * f[left][right] === f[left + 1][right - 1] && s.charAt(left)==s.charAt(right)
     */
    //自底向上 f[left][right] <-  f[left + 1][right - 1] && s.charAt(left)==s.charAt(right)

    /**
     * debug记录：
     * 一：WRONG: 6 / 180 个通过测试用例 .  输入："babad"   输出："abad"  预期结果： "bab"
     *      debug:  line:78  -: resultRight = i+j;  +: resultRight = i+j-1
     * 二：WRONG: 115 / 180 个通过测试用例  输入："ccc"   输出："cc"  预期结果： "ccc"
     *      debug:  line:64  +: if (length==3) {...}
     * 三：WRONG:  117 / 180 个通过测试用例 输入："aaaa"   输出："aaa"  预期结果： "aaaa"
     *      debug:  line:73  -: < ; +: <=
     * 四： AC
     */
    class Solution {
        public String longestPalindrome(String s) {
            int length = s.length();
            if(s==null || s.length()==0) {
                return "";
            }
            boolean[][] isPalindrome = new boolean[length][length];//
            //[resultLeft,resultRight]  :  结果区间
            int resultLeft = 0;
            int resultRight = 0;
            //处理边界
            for (int i = 0; i < length -1 ; i++) {
                isPalindrome[i][i] = true;
                isPalindrome[i][i+1] = s.charAt(i) == s.charAt(i+1) ? true : false;
                if (isPalindrome[i][i+1] == true) {
                    resultLeft = i;
                    resultRight = i+1;
                }
            }
            isPalindrome[length-1][length-1] = true;
            if (length==3) {
                if(s.charAt(0) == s.charAt(2)) {
                    return s;
                }
                else {
                    return s.substring(resultLeft, resultRight + 1);
                }
            }
            // 金字塔。 i: 区间长度
            for (int i = 3; i <= length; i++) {
                for (int j = 0; j + i - 1 < length; j++) { // j: left
                    isPalindrome[j][j + i - 1]  =  isPalindrome[j+1][i+j-2] && s.charAt(j) == s.charAt(j + i - 1) ;
                    if (isPalindrome[j][j + i - 1] == true) {
                        resultLeft = j;
                        resultRight = i+j-1;
                    }

                }

            }
            return s.substring(resultLeft, resultRight + 1);

        }
    }
    //todo: 带备忘的自顶向下

    @Test
    public void test(){
//        String longestPalindrome = solution.longestPalindrome("babad");
//        System.out.println(longestPalindrome);
//        System.out.println(solution.longestPalindrome("ccc"));
        System.out.println(solution.longestPalindrome("aaaa"));
    }
    //discard
   /* *//**
     * 思路: 线性DP
     * f(k)=[...,k]的最长回文子串长
     * f(n) = max{f(n-1)+2,  }//wrong,可以比f(n-1)+2长
     *
     *//*
    class Solution {
        public String longestPalindrome(String s) {
            int length = s.length();
            int[] f = new int[length];
            if(s==null || length==0) {
                return "";
            }
            int longest = 1;
            f[0] = 1;
            for (int i = 1; i < length; i++) {
                if(s.charAt(i) == s.charAt(i-1-f[i-1])) {
                    f[i] = Math.max(longest, f[i-1]+2);
                    longest =Math.max(f[i], longest);

                }else {
                    f[i] = longest;
                }

            }
        }
    }*/
}

/**
 * 字符串 动态规划
 */