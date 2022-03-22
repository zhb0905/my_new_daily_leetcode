package com.zhb.simple;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author zhb
 * @create 2022-03-23 2:17
 */

/**
 * 标签： 数组， 哈希表
 */
public class Problem_1_TwoSum {
    //方法一：暴力枚举
    private Solution solution = new Solution();
    class Solution {
        public int[] twoSum(int[] nums, int target){
            int n = nums.length;
            for (int i = 0; i < n; i++) {
                for (int j = i+1; j < n; j++) {
                    if (nums[i] + nums[j] ==target) {
                        return new int[]{i, j};
                    }
                }
            }
            return new int[0];
        }
    }
    @Test
    public void testSolution(){
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("src/com/zhb/simple/Problem_1_TwoSum.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Scanner scanner = new Scanner(fileInputStream);
        while(scanner.hasNext()) {
            String s = scanner.nextLine();
            String[] s1 = s.substring(1, s.length()-1).split(",");
            int[] nums = Arrays.stream(s1).mapToInt(Integer::parseInt).toArray();
            Integer target = Integer.parseInt(scanner.nextLine());
            System.out.println(Arrays.toString(solution.twoSum(nums, target)));
        }
    }

}

