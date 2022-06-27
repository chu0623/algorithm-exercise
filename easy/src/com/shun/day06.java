package com.shun;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/**
 * @Description: 有效的括号(https://leetcode.cn/problems/merge-two-sorted-lists/submissions/)
 * @author: chushunshun
 * @date: 2022/6/27 10:12
 * @param:
 */
public class day06 {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1,new ListNode(2,new ListNode(4,null)));
        ListNode list2 = new ListNode(1,new ListNode(3,new ListNode(4,null)));
        System.out.println(mergeTwoLists2(list1,list2));

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
        ListNode compare = list2;

        ListNode nextLastNode = null;

        while (next != null && compare != null){
            if (next.val >= compare.val){
                nextLastNode = compare;
                if (null == compare.next){
                    compare.next = next;
                    next = null;
                }
                compare = compare.next;

            }else {
                ListNode listNode = next.next;
                if (nextLastNode != null){
                    next.next = nextLastNode.next;
                    nextLastNode.next = next;
                }else {
                    next.next = compare;
                }

                nextLastNode = next;
                next = listNode;
            }
        }
        return list2.val > list1.val ? list1 : list2;
    }


    public static ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        // 类似归并排序中的合并过程
        ListNode dummyHead = new ListNode(0);
        ListNode cur = dummyHead;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                cur.next = l1;
                cur = cur.next;
                l1 = l1.next;
            } else {
                cur.next = l2;
                cur = cur.next;
                l2 = l2.next;
            }
        }
        // 任一为空，直接连接另一条链表
        if (l1 == null) {
            cur.next = l2;
        } else {
            cur.next = l1;
        }
        return dummyHead.next;
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
