package com.example.test.solutions;

import java.util.ArrayList;
import java.util.List;

public class Solution2420 {
    /*
    2420. Find All Good Indices
Solved
Medium
Topics
Companies
Hint
You are given a 0-indexed integer array nums of size n and a positive integer k.

We call an index i in the range k <= i < n - k good if the following conditions are satisfied:

The k elements that are just before the index i are in non-increasing order.
The k elements that are just after the index i are in non-decreasing order.
Return an array of all good indices sorted in increasing order.



Example 1:

Input: nums = [2,1,1,1,3,4,1], k = 2
Output: [2,3]
Explanation: There are two good indices in the array:
- Index 2. The subarray [2,1] is in non-increasing order, and the subarray [1,3] is in non-decreasing order.
- Index 3. The subarray [1,1] is in non-increasing order, and the subarray [3,4] is in non-decreasing order.
Note that the index 4 is not good because [4,1] is not non-decreasing.
Example 2:

Input: nums = [2,1,1,2], k = 2
Output: []
Explanation: There are no good indices in this array.


Constraints:

n == nums.length
3 <= n <= 105
1 <= nums[i] <= 106
1 <= k <= n / 2
     */
    public static List<Integer> goodIndices(int[] nums, int k) {
        int n = nums.length;
        List<Integer> goodIndices = new ArrayList<>();

        for (int i = k; i < n - k; i++) {
            boolean nonIncreasing = true;
            boolean nonDecreasing = true;
            for (int j = i-k; j < i-1; j++) {
                if(nums[j]<nums[j+1]){
                    nonIncreasing = false;
                    break;
                }

            }
            for (int j = i+1; j < i+k; j++) {
                if(nums[j]>nums[j+1]){
                    nonDecreasing = false;
                    break;
                }

            }
            if(nonIncreasing && nonDecreasing)
                goodIndices.add(i);

        }
        return goodIndices;
    }

    public static void main(String[] args) {
        int[] nums = {2,1,1,1,3,4,1};
        int k = 2;
        System.out.println(goodIndices(nums,k));
    }
}
