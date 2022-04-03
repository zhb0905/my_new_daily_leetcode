package com.zhb.simple.from151to200;

/**
 * @author zhb
 * @create 2022-04-03 17:37
 */

/**
 * 168. Excel表列名称
 * 给你一个整数 columnNumber ，返回它在 Excel 表中相对应的列名称。
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
 */
public class Problem_168_ConvertToTitle {
    /**
     * 思路：10进制转26进制
     * 注意点：Z <- 26 , 而非 0 -> ’@‘
     *
     * debug记录：一：AC
     */
    class Solution {
        public String convertToTitle(int columnNumber) {
            StringBuffer stringBuffer = new StringBuffer();
            while (columnNumber > 0 ) {
                int remainder = columnNumber % 26;//余数
                char temp;
                if (remainder != 0) {
                    temp = (char) (remainder + 64);
                } else {
                    temp = 'Z';
                }
                stringBuffer.append(temp);
                columnNumber /= 26;
                columnNumber = (remainder == 0)? columnNumber - 1 : columnNumber;
            }
            return stringBuffer.reverse().toString();
        }
    }
}
/**
 * 数学 字符串
 */