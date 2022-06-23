package com.shun;

public class Day02 {
   //给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
   //回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
   //例如，121 是回文，而 123 不是。
   //来源：力扣（LeetCode）
   //链接：https://leetcode.cn/problems/palindrome-number
   //著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

    public static void main(String[] args) {
        System.out.println( isPalindrome(10));
    }

    
    public static boolean isPalindrome(int x) {
        String s = String.valueOf(x);

        for (int i = 0; i <s.length();i++) {
            int tailIndex = s.length() - i - 1;
            if (i == tailIndex){
                break;
            }
            int head = s.charAt(i);
            int tail = s.charAt(tailIndex);

            if (head != tail) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome2(int x) {
        // 特殊情况：
        // 如上所述，当 x < 0 时，x 不是回文数。
        // 同样地，如果数字的最后一位是 0，为了使该数字为回文，
        // 则其第一位数字也应该是 0
        // 只有 0 满足这一属性
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }

        // 当数字长度为奇数时，我们可以通过 revertedNumber/10 去除处于中位的数字。
        // 例如，当输入为 12321 时，在 while 循环的末尾我们可以得到 x = 12，revertedNumber = 123，
        // 由于处于中位的数字不影响回文（它总是与自己相等），所以我们可以简单地将其去除。
        return x == revertedNumber || x == revertedNumber / 10;
    }
}
