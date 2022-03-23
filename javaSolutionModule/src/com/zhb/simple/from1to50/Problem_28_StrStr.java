package com.zhb.simple.from1to50;

/**
 * @author zhb
 * @create 2022-03-24 1:51
 */

/**
 * 28. 实现 strStr()
 *
 * 实现strStr()函数。
 *
 * 给你两个字符串 haystack 和 needle ，请你在 haystack 字符串中找出 needle 字符串出现的第一个位置（下标从 0 开始）。如果不存在，则返回  -1 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/implement-strstr
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 *
 */
public class Problem_28_StrStr {
    class Solution {
        public int strStr(String haystack, String needle) {
            //AC : return  haystack.indexOf(needle);
            //即手写indexOf,字符串单模匹配
            //方法一:KMP
            //方法二:暴力
            int longStrLength = haystack.length();
            int shortStrLength = needle.length();
            for (int i = 0; i + shortStrLength -1 < longStrLength ; i++) {
                if(needle.equals(haystack.substring(i,i + shortStrLength ))){
                    return i;
                }

            }
            return -1;
        }
    }
}
/**
 * 标签 ：数组 双指针
 */
