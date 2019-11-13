package com.xu.leetcode.leetcode_02;

public class ListNode {
    int val;
    ListNode next;
    public ListNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        return  val +
                ">>" + next;
    }
}
