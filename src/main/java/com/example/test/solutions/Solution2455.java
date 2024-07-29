package com.example.test.solutions;

public class Solution2455 {
    /*
    2455. Average Value of Even Numbers That Are Divisible by Three
Solved
Easy
Topics
Companies
Hint
Given an integer array nums of positive integers, return the average value of all even integers that are divisible by 3.

Note that the average of n elements is the sum of the n elements divided by n and rounded down to the nearest integer.



Example 1:

Input: nums = [1,3,6,10,12,15]
Output: 9
Explanation: 6 and 12 are even numbers that are divisible by 3. (6 + 12) / 2 = 9.
Example 2:

Input: nums = [1,2,4,7,10]
Output: 0
Explanation: There is no single number that satisfies the requirement, so return 0.

     */
    public static int averageValue(int[] nums) {
        int count = 0;
        int sum = 0;
        for(int num : nums){

            if(num % 3 == 0 && num % 2 == 0){
                count ++;
                sum += num;
            }
        }
        return count > 0 ? sum/count : 0;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,6,10,12,15};
        System.out.println(averageValue(nums));
    }
}
