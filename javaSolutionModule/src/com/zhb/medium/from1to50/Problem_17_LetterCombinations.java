package com.zhb.medium.from1to50;

/**
 * @author zhb
 * @create 2022-03-25 1:13
 */

import org.junit.Test;


import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * 17. 电话号码的字母组合
 * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。答案可以按 任意顺序 返回。
 *
 * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母
 */
public class Problem_17_LetterCombinations {
    /**
     * 思路：
     * 哈希表 字典树的带回溯的DFS
     *
     * debug记录：一：AC
     */
    class Solution {
        StringBuffer word = new StringBuffer();
        HashMap<Character, String> hashMap = new HashMap<>(){
            {
                put('2',"abc");
                put('3', "def");
                put('4', "ghi");
                put('5', "jkl");
                put('6', "mno");
                put('7', "pqrs");
                put('8', "tuv");
                put('9', "wxyz");
            }
        };
        int length;//digits位数, 最终word长度，叶子深度
        List<String> words = new LinkedList<>();
        String digits;
        public List<String> letterCombinations(String digits) {
            if(digits.length() == 0) {
                return words;
            }
            this.digits = digits;
            length = digits.length();//word长度，叶子深度
            backtrackingDFS(0);
            return words;
        }

        /**
         * 字典树的带回溯的DFS
         * @param depth 结点深度, depth = 1 <===> hashMap.get(digits.charAt(0)) ,根节点是哨兵
         */
        public void backtrackingDFS(int depth) {//23
            //todo: if(leaf) 加入结果集
            if(word.length() == length) {
                words.add(word.toString());//此时depth = length
                return;
            }
            String charsAtThisDepth = hashMap.get((digits.charAt(depth)));//abc
            for (int i = 0; i < charsAtThisDepth.length(); i++) {
                //加状态
                word.append(charsAtThisDepth.charAt(i));
                backtrackingDFS(depth+1);
                //减状态
                word.deleteCharAt(depth);
            }
        }
    }
    Solution solution = new Solution();
    @Test
    public void test(){
        List<String> strings = solution.letterCombinations("23");
        System.out.println(strings.toString());
    }
}
/**
 * 哈希表 字符串 回溯
 */