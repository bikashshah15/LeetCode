package com.example.test.solutions;

public class Solution231 {
    /*
    231. Power of Two
Solved
Easy
Topics
Companies
Given an integer n, return true if it is a power of two. Otherwise, return false.

An integer n is a power of two, if there exists an integer x such that n == 2x.



Example 1:

Input: n = 1
Output: true
Explanation: 20 = 1
Example 2:

Input: n = 16
Output: true
Explanation: 24 = 16
Example 3:

Input: n = 3
Output: false
     */
    public static boolean isPowerOfTwo(int n) {
        if(n == 1)
            return true;
        if(n%2 == 1)
            return false;
        for (int i = 0; i < 31; i++) {
            if(Math.pow(2,i) == n)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 32;
        System.out.println(isPowerOfTwo(n));

    }
}
