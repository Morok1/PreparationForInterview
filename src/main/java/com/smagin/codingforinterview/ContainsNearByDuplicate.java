package com.smagin.codingforinterview;


//Given an array of integers and an integer k, find out whether there are two distinct indices i and
//j in the array such that nums[i] = nums[j] and the absolute difference between i and j is at most k.


public class ContainsNearByDuplicate {
    public int[] containsNearByDuplicate(int[] nums, int k) {
        int[] result = new int[2];
        int length = result.length;
        for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++) {
                if ((nums[i] == nums[j]) && (Math.abs(i - j) > k)) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
}
