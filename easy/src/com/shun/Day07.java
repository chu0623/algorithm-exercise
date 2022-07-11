package com.shun;

/**
 * @Description: 删除有序数组中的重复项(https://leetcode.cn/problems/remove-duplicates-from-sorted-array/)
 * @author: chushunshun
 * @date: 2022/6/27 10:12
 * @param:
 */
public class Day07 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,1,2,2,2,5,4};
        System.out.println(removeDuplicates(nums));

    }

    public static int removeDuplicates(int[] nums) {
        int j = 0;
        int i = 1;
        while (i < nums.length) {
            if (nums[j] != nums[i]){
                nums[++j] = nums[i];
            }
            i++;
        }
        return ++j;
    }
}
