package com.shun;

/**
 * @Description: 最长公共前缀(https://leetcode.cn/problems/longest-common-prefix/)
 * @author: chushunshun
 * @date: 2022/6/27 10:12
 * @param:
 */
public class day04 {
    public static void main(String[] args) {
        String[] strings = new String[]{"aower","elow","flight"};
        System.out.println(longestCommonPrefix(strings));

    }

    public static String longestCommonPrefix(String[] strs) {
        if (null == strs || strs.length == 0){
            return "";
        }

        String s=strs[0];
        for (String string : strs) {
            while(!string.startsWith(s)){
                s=s.substring(0,s.length()-1);
            }
        }
        return s;
    }
}
