package com.shun;

/**
 * @Description:  移除元素(https://leetcode.cn/problems/remove-element/)
 * @author: chushunshun
 * @date: 2022/6/27 10:12
 * @param:
 */
public class day08 {
    public static void main(String[] args) {
        int[] nums = new int[]{2,1,2,2,2,2,2,5,4};
        System.out.println(removeElement(nums,2));

    }

    public static int removeElement(int[] nums, int val) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val){
                nums[j++] = nums[i];
            }
        }
        return j;
    }
}
