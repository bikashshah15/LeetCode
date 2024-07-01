package com.example.test.solutions;

import java.util.*;

public class Solution219 {
    /*
    219. Contains Duplicate II
Solved
Easy
Topics
Companies
Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.



Example 1:

Input: nums = [1,2,3,1], k = 3
Output: true
Example 2:

Input: nums = [1,0,1,1], k = 1
Output: true
Example 3:

Input: nums = [1,2,3,1,2,3], k = 2
Output: false


Constraints:

1 <= nums.length <= 105
-109 <= nums[i] <= 109
0 <= k <= 105
     */
    public static boolean containsNearbyDuplicate(int[] nums, int k) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = Math.max(0, i - k); j < i; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }

            list.add(nums[i]);

            // Keep the list size within k elements
            if (list.size() > k) {
                list.remove(0);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,0,1,1};
        int k = 1;
        System.out.println(containsNearbyDuplicate(nums,k));
    }
}
