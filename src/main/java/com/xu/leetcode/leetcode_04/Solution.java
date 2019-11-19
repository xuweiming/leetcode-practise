package com.xu.leetcode.leetcode_04;

public class Solution {
    /**
     * 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。
     *
     * 请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
     *
     * 你可以假设 nums1 和 nums2 不会同时为空。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/median-of-two-sorted-arrays
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * 示例 1:
     *
     * nums1 = [1, 3]
     * nums2 = [2]
     *
     * 则中位数是 2.0
     * 示例 2:
     *
     * nums1 = [1, 2]
     * nums2 = [3, 4]
     *
     * 则中位数是 (2 + 3)/2 = 2.5
     * @param nums1
     * @param nums2
     * @return
     * 判断两个数边界
     */
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //先排序
        int length = nums1.length + nums2.length;
        int[] arrs = new int[length];
        int nums1Start = 0;
        int nums2Start = 0;
        for (int i = 0; i < length; i++) {
            if(nums1Start>=nums1.length) {
                arrs[i] = nums2[nums2Start++];
                continue;
            }
            if(nums2Start>=nums2.length) {
                arrs[i] = nums1[nums1Start++];
                continue;
            }
            if(nums1[nums1Start] > nums2[nums2Start]) {
                arrs[i] = nums2[nums2Start++];
            }else {
                arrs[i] = nums1[nums1Start++];
            }
        }
        //取中间值
        if(length%2 != 0) {
            return arrs[length/2];
        }
        return (arrs[length/2] + arrs[length/2 - 1])/2.0;
    }
}
