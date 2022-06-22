package com.shun;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Day01 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum2(new int[]{2, 8, 3}, 10)));

    }

    /**
     * 给定一个整数数组 nums和一个整数目标值 target，请你在该数组中找出 和为目标值 target的那两个整数，并返回它们的数组下标。
     * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
     * 你可以按任意顺序返回答案。
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/two-sum
     */

    //刚开始直接使用暴力解法
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    //后来参考了别人的使用Map
    public static int[] twoSum2(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if (map.containsKey(difference)) {
                result[0] = map.get(difference);
                result[1] = i;
                return result;
            }
            map.put(nums[i], i);
        }
        return result;
    }
}
