package com.zhb.simple.from51to100;

/**
 * @author zhb
 * @create 2022-03-24 3:54
 */

import org.junit.Test;

/**
 * 67. 二进制求和
 * 给你两个二进制字符串，返回它们的和（用二进制表示）。
 *
 * 输入为 非空 字符串且只包含数字 1 和 0。
 */
public class Problem_67_AddBinary {

    private Solution solution = new Solution();

    class Solution {
        // 模拟cpu串行加
        public String addBinary(String a, String b) {
            if (a.length() < b.length()) {
                String temp = a ;
                a = b;
                b = temp;

            }
            String result = new String();
            int carryBit = 0;
            int bLength = b.length();
            int aLength = a.length();
            while ( --bLength >= 0) {
                int tempSum = (a.charAt(--aLength) - '0') + (b.charAt(bLength) - '0') +carryBit;
                carryBit = tempSum / 2;
                result += String.valueOf(tempSum % 2);
            }
            while (--aLength >= 0){
                if(carryBit == 0) {
                    break;
                }
                int tempSum = (a.charAt(aLength) - '0') + carryBit;
                carryBit = tempSum / 2;
                result += String.valueOf(tempSum % 2);
            }
            if (carryBit==1) {
                StringBuilder reverse = new StringBuilder(result).reverse();
                String s = new String("1");
                return s.concat(reverse.substring(0,reverse.length()));
            }
            else {
                StringBuilder reverse = new StringBuilder(result).reverse();
                return a.substring(0,aLength+1).concat(reverse.substring(0,reverse.length()));
            }

        }
    }

    @Test
    public void testSolution(){
        System.out.println(solution.addBinary("1", "111"));
    }

}

/**
 * 标签： 位运算 ； 数学 ；字符串 ； 模拟
 */