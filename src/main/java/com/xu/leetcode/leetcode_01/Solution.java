package com.xu.leetcode.leetcode_01;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    /**
     * Given nums = [2, 7, 11, 15], target = 9,
     *
     * Because nums[0] + nums[1] = 2 + 7 = 9,
     * return [0, 1].
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        int[] res = null;
        if(nums!=null || nums.length > 1) {
            res = new  int[2];
            Map<Integer,Integer> map = new HashMap<Integer, Integer>(nums.length);
            for (int i = 0; i < nums.length; i++) {
                if (map.containsKey(nums[i])) {
                    res[0] = map.get(nums[i]);
                    res[1] = i;
                    break;
                }
                map.put(target - nums[i],i);
            }
        }
        return res;
    }
}
