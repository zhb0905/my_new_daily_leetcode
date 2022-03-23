package com.zhb.simple.from1to50;

import org.junit.Test;

import java.util.Arrays;
import java.util.Optional;

/**
 * @author zhb
 * @create 2022-03-23 6:23
 */

/**
 * 14. 最长公共前缀
 * 标签 字符串
 */
public class Problem_14_LongestCommonPrefix {

    private Solution solution = new Solution();

    //方法一: reduce归约
    class Solution {
        public String longestCommonPrefix(String[] strs) {
            Optional<String> reduce = Arrays.stream(strs).reduce((str1, str2) -> getCommonPrefix(str1, str2));
            String result =  reduce.orElse(new String(""));
            System.out.println(result);
            return result;
//            return null;
        }
        public String getCommonPrefix(String str1, String str2) {
            String prefix = new String();
            for (int i = 0 ; i < str1.length() && i <str2.length() ; i++ ) {
                if(str1.charAt(i) == str2.charAt(i)) {
                    prefix += String.valueOf(str1.charAt(i));
                }
                else break;
            }
            return prefix;
        }

    }
    // 方法二: 纵向扫描
    class Solution_2 {
        public String longestCommonPrefix(String[] strs) {
           if (strs == null || strs.length == 0) {
               return "";
           }

           int lengthOfStr0 = strs[0].length();
           int numberOfStr = strs.length;
            for (int i = 0; i < lengthOfStr0; i++) {
                char thisRound = strs[0].charAt(i);
                for (int j = 1; j < numberOfStr; j++) {
                    if( strs[j].length() <=i || strs[j].charAt(i) != thisRound) {
                        return strs[0].substring(0, i);
                    }
                }
            }
            return strs[0];
        }
    }
    @Test
    public void testSolution(){
//        String commonPrefix = solution.getCommonPrefix("flower", "flow");
//        System.out.println(commonPrefix);
        String s = solution.longestCommonPrefix(new String[]{"flower", "flow", "flight"});
        System.out.println(s);
    }
}
