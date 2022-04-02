package com.zhb.simple.from151to200;

/**
 * @author zhb
 * @create 2022-04-01 1:35
 */

import java.util.HashMap;
import java.util.Map;

/**
 * 169. 多数元素
 * 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
 *
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 */
public class Problem_169_MajorityElement {
    class Solution {
        public int majorityElement (int[] nums) {
            Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
            for (int num:
                 nums) {
                if(hashMap.containsKey(num)) {
                    hashMap.put(num, hashMap.get(num) + 1) ;
                } else {
                    hashMap.put(num, 1) ;
                }
            }
            Map.Entry<Integer, Integer> majorityEntry = null;

            for (Map.Entry<Integer, Integer> entry:
                 hashMap.entrySet()) {
                if ( majorityEntry == null || entry.getValue() > majorityEntry.getValue() ) {
                    majorityEntry = entry ;
                }
            }
            return majorityEntry.getKey();
        }
    }
}
/**
 * 数组 哈希表 分治 计数 排序
 */