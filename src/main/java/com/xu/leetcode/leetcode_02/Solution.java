package com.xu.leetcode.leetcode_02;

public class Solution {
    /**
     * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
     * Output: 7 -> 0 -> 8
     * Explanation: 342 + 465 = 807.
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        getRes(l1,l2,0,res);
        return res.next;
    }
    private void getRes(ListNode l1,ListNode l2,int carry,ListNode res) {
        if(l1==null) {
            l1 = new ListNode(0);
        }
        if(l2==null) {
            l2 = new ListNode(0);
        }
        int sum = l1.val + l2.val + carry;
        res.next = new ListNode(sum%10);
        carry = sum/10;
        if(l1.next !=null || l2.next !=null || carry>0) {
            getRes(l1.next,l2.next,carry,res.next);
        }
    }
}
