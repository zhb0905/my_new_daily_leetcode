package com.zhb.simple.from1to100;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author zhb
 * @create 2022-03-23 5:37
 */

/**
 * 13. 罗马数字转整数
 * 标签 ： 哈希表， 数学， 字符串
 */
public class Problem_13_RomanToInt {

    private Solution solution = new Solution();

    class Solution {
        public int romanToInt(String s) {
            Map<Character, Integer> hashMap = new HashMap<>();
            //todo:build hashMap
            hashMap.put('I', 1);
            hashMap.put('V', 5);
            hashMap.put('X', 10);
            hashMap.put('L', 50);
            hashMap.put('C', 100);
            hashMap.put('D', 500);
            hashMap.put('M', 1000);
            int result = 0 ;
            for (int i = 0; i < s.length()-1; i++) {
                Integer integerLeft = hashMap.get(s.charAt(i));
                Integer integerRight = hashMap.get(s.charAt(i+1));
                /*if (integerLeft >= integerRight) {
                    result += integerLeft;
                }*/
                if (integerLeft * 5 ==  integerRight || integerLeft * 10 == integerRight) {
                    result -= integerLeft;
                }
                else{
                    result += integerLeft;
                }
            }
            Integer integerLast = hashMap.get(s.charAt(s.length()-1));
            result += integerLast;
            return result;
        }
    }

    @Test
    public void testSolution(){
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("src/com/zhb/simple/from1to100/Problem_13_RomanToInt.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Scanner scanner = new Scanner(fileInputStream);
        while (scanner.hasNext()) {
            String s1 = scanner.nextLine();
            int i = Integer.parseInt(scanner.nextLine());
            System.out.println(solution.romanToInt(s1) == i);
        }


    }
}
