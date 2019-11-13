package com.xu.leetcode.leetcode_02;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    /**
     * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
     * Output: 7 -> 0 -> 8
     * Explanation: 342 + 465 = 807
     */
    @Test
    public void addTwoNumbers() {
        ListNode l11 = new ListNode(2);
        ListNode l12 = new ListNode(4);
        l11.next = l12;
        ListNode l13 = new ListNode(3);
        l12.next = l13;
        ListNode l21 = new ListNode(5);
        ListNode l22 = new ListNode(6);
        l21.next = l22;
        ListNode l23 = new ListNode(4);
        l22.next = l23;
        Solution solution = new Solution();
        ListNode listNode = solution.addTwoNumbers(l11, l21);
        System.out.println(listNode);
    }

    @Test
    public void addTwoNumbers2() {
        ListNode l11 = new ListNode(5);
        ListNode l21 = new ListNode(5);
        Solution solution = new Solution();
        ListNode listNode = solution.addTwoNumbers(l11, l21);
        System.out.println(listNode);
    }
}
