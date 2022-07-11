package com.shun;

//给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
//
//        请必须使用时间复杂度为 O(log n) 的算法。
//
//        来源：力扣（LeetCode）
//        链接：https://leetcode.cn/problems/search-insert-position
//        著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
public class Day10 {
    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1,3,5,6,7},2));
    }


    public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num >= target){
                return i;
            }
        }
        return nums.length;
    }
}
