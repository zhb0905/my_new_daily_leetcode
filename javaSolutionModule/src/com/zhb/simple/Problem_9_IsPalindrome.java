package com.zhb.simple;

/**
 * @author zhb
 * @create 2022-03-23 5:07
 */

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 9. 回文数
 * 标签： 数学 对撞指针
 */
public class Problem_9_IsPalindrome {

    private Solution solution = new Solution();

    class Solution {
        public boolean isPalindrome(int x) {
            String s = String.valueOf(x);
            for (int i = 0, j = s.length()-1; i <j ; i++, j--) {
                if(s.charAt(i) != s.charAt(j)) {
                    return false;
                }
            }
            return true;
        }
    }

    @Test
    public void testSolution(){
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("src/com/zhb/simple/Problem_9_IsPalindrome.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Scanner scanner = new Scanner(fileInputStream);
        while (scanner.hasNext()) {
            int x = scanner.nextInt();
            System.out.println(solution.isPalindrome(x));

        }
    }
}
