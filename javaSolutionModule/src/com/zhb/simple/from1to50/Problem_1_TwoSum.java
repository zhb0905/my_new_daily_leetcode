package com.zhb.simple.from1to50;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author zhb
 * @create 2022-03-23 2:17
 */

/**
 * 标签： 数组， 哈希表
 */
public class Problem_1_TwoSum {

    private Solution solution = new Solution();

    //方法一：暴力枚举,枚举C（n,2）
/*    class Solution {
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
    }*/
    //方法二：HashMap(必须先判断，在添加)
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> hashMap = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                if(hashMap.containsKey(target-nums[i])) {
                    return new int[]{hashMap.get(target-nums[i]), i};
                }
                hashMap.put(nums[i], i);
            }
            return new int[0];
        }

    }

    @Test
    public void testSolution(){
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("src/com/zhb/simple/from1to100/Problem_1_TwoSum.txt");
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

