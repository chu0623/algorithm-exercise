package com.shun;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;

/**
 * @Description: 有效的括号(https://leetcode.cn/problems/valid-parentheses/)
 * @author: chushunshun
 * @date: 2022/6/27 10:12
 * @param:
 */
public class day05 {
    public static void main(String[] args) {
        System.out.println(isValid("{[]}"));

    }

    public static boolean isValid(String s) {
        Map<Character,Character> map = new HashMap<>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');

        LinkedList<Character> list = new LinkedList<>();

        for (char c : s.toCharArray()) {
            Character character = map.get(c);
            if (null != character){
                list.add(character);
            }else {
                if (list.size() == 0){
                    return false;
                }else {
                    Character character1 = list.getLast();
                    if (character1 == c){
                        list.removeLast();
                    }else {
                        return false;
                    }
                }
            }
        }
        return list.size() == 0;
    }

    public static boolean isValid3(String s) {
        Map<Character,Character> map = new HashMap<>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');

        Stack<Character> stack = new Stack<Character>();

        for(char c: s.toCharArray()){
            Character character = map.get(c);
          if (null != character){
            stack.push(character);
          } else if(stack.isEmpty()||c!=stack.pop()){
                return false;
            }
        }
        return stack.isEmpty();
    }
}
