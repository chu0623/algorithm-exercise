package com.shun;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/**
 * @Description: 有效的括号(https://leetcode.cn/problems/valid-parentheses/)
 * @author: chushunshun
 * @date: 2022/6/27 10:12
 * @param:
 */
public class day06 {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1,new ListNode(6,null));
        ListNode list2 = new ListNode(1,new ListNode(2,new ListNode(4,null)));
        System.out.println(mergeTwoLists(list1,list2));

    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null || list2 == null){
            if (list1 != null){
                return list1;
            }else {
                return list2;
            }
        }

        ListNode next = list1;
        ListNode first = list2;

        ListNode nextLastNode = null;
        while (next != null && first != null){
            ListNode listNode;
            if (next.val >= first.val){
                nextLastNode = next;
                if (null == first.next){
                    first.next = next;
                    next = null;
                }
                first = first.next;
            }else {
                //first = first.next;
                if (nextLastNode != null){
                    nextLastNode.next = next;
                    next.next = first;

                    nextLastNode.next = next.next;
                }
                next = next.next;
            }

        }
        return list2.val > list1.val ? list1 : list2;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }
}
