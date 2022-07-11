package com.shun;
//实现 strStr()
public class Day09 {
    public static void main(String[] args) {
        System.out.println(strStr("i","i"));
    }


    public static int strStr(String haystack, String needle) {
        int index = -1;
        if (needle.length() > haystack.length()){
            return index;
        }

        int nLength = needle.length();
        int hLength = haystack.length();

        for (int i = 0; i < hLength; i ++) {
            char c = haystack.charAt(i);

            if (c == needle.charAt(0)){
                if (hLength < i + nLength){
                    return index;
                }else if (haystack.substring(i,i+ nLength).equals(needle)){
                    return i;
                }
            }
        }
        return index;
    }
}
