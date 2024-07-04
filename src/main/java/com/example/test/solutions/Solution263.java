package com.example.test.solutions;

public class Solution263 {
    /*
    263. Ugly Number
    An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.

Given an integer n, return true if n is an ugly number.



Example 1:

Input: n = 6
Output: true
Explanation: 6 = 2 × 3
Example 2:

Input: n = 1
Output: true
Explanation: 1 has no prime factors, therefore all of its prime factors are limited to 2, 3, and 5.
Example 3:

Input: n = 14
Output: false
Explanation: 14 is not ugly since it includes the prime factor 7.


Constraints:

-231 <= n <= 231 - 1
     */
    public static boolean isUgly(int n) {
        if(n<=0)
            return false;
        int[] primes = {2,3,5};
        for(int prime : primes){
            while (n%prime == 0){
                n /= prime;
            }
        }
        return n == 1;
    }

    public static void main(String[] args) {
        int n = 14;
        System.out.println(isUgly(n));
    }
}
