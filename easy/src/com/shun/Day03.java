package com.shun;

import java.util.HashMap;
import java.util.Map;

//罗马数字转整数1
public class Day03 {

    //罗马数字转整数
    public static void main(String[] args) {
        System.out.println(romanToInt("IVI"));
    }

    public static Map<Character,Integer> initMap(){
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        return map;
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> map = initMap();
        char[] chars = s.toCharArray();

        int total = 0;
        for (int i = 0; i < chars.length; i++) {
            int number = map.get(chars[i]);

            if (i+1 == chars.length){
                total += number;
                return total;
            }
            int next = map.get(chars[i + 1]);

            if (next > number){
                total -= number;
            }else{
                total += number;
            }
        }
        return total;
    }
}
