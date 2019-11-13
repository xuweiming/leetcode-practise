package com.xu.leetcode.leetcode_01;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void twoSum() {
        Solution solution = new Solution();
        int[] nuums = {2,7,11,16};
        int target = 9;
        int[] ints = solution.twoSum(nuums, target);
        System.out.println(ints);
    }
}
