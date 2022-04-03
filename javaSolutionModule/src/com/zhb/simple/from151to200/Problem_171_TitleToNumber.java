package com.zhb.simple.from151to200;

/**
 * @author zhb
 * @create 2022-04-03 18:59
 */

/**
 * 171. Excel 表列序号
 * 给你一个字符串 columnTitle ，表示 Excel 表格中的列名称。返回 该列名称对应的列序号 。
 *
 * 例如：
 *
 * A -> 1
 * B -> 2
 * C -> 3
 * ...
 * Z -> 26
 * AA -> 27
 * AB -> 28
 * ...
 */
public class Problem_171_TitleToNumber {
    /**
     * 思路：26进制转10进制
     *
     * debug记录：一：AC
     */
    class Solution {
        public int titleToNumber(String columnTitle) {
            int length = columnTitle.length();
            int powerOf26 = 1; //26**0
            int answer = 0;
            while (--length >= 0) {
                int number = columnTitle.charAt(length) - 64;
                answer += number * powerOf26;
                powerOf26 *= 26;
            }
            return answer;
        }
    }

}
/**
 * 数学 字符串
 */