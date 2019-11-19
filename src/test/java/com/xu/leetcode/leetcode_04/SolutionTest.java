package com.xu.leetcode.leetcode_04;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void findMedianSortedArrays() {
        int[] nums1 = {};
        int[] num2 = {2};
        Solution solution = new Solution();
        double medianSortedArrays = solution.findMedianSortedArrays(nums1, num2);
        Assert.assertEquals(medianSortedArrays,2.0);
    }
}