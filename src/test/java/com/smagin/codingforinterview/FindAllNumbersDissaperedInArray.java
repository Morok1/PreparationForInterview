package com.smagin.codingforinterview;

//Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.
//
//Find all the elements of [1, n] inclusive that do not appear in this array.
//
//Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.
//
//Example:
//
//Input:
//[4,3,2,7,8,2,3,1]
//
//Output:
//[5,6]


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAllNumbersDissaperedInArray {
    public List<Integer> findAllNumbersContainsInclusiveValues(int[] testArray, int k){
        List<Integer> resultList = new ArrayList<Integer>();

        Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();

        for (int i = 0; i < testArray.length ; i++) {
            map.put(i, Boolean.TRUE);
        }

        for (Map.Entry entry: map.entrySet()) {
            if(entry.getValue().equals(Boolean.TRUE)){
                resultList.add((Integer) entry.getKey());
            }
        }

        return resultList;
    }
}
