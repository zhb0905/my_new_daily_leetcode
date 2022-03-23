package com.zhb.simple.from1to50;

import java.util.Stack;

/**
 * @author zhb
 * @create 2022-03-23 20:21
 */

/**
 * 20. 有效的括号
 * 标签 ： 栈  字符串
 */
public class Problem_20_IsValid {
    // 方法：栈。优化:HashMap
        class Solution {
            public boolean isValid(String s ) {
                String bracketsLeft = new String("({[");
                String bracketsRight = new String(")}]");
                Stack<String> bracketsStack = new Stack<>();
                for (int i = 0; i < s.length(); i++) {
                    String s1 = String.valueOf(s.charAt(i));
                    if(bracketsLeft.contains(s1)){
                        bracketsStack.push(s1);
                    }
                    else if (bracketsRight.contains(s1)) {
                        if (bracketsStack.empty()) {return false;}
                        String pop = bracketsStack.pop();
                        int index = bracketsLeft.indexOf(pop);
                        if( !s1.equals(String.valueOf(bracketsRight.charAt(index)))){
                            return false;
                        }
                    }


                }
                if(bracketsStack.empty()) {return true;}
                return false;
            }
        }
}
