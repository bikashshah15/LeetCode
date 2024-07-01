package com.example.test.solutions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution202 {
    /*
    202. Happy Number
Solved
Easy
Topics
Companies
Write an algorithm to determine if a number n is happy.

A happy number is a number defined by the following process:

Starting with any positive integer, replace the number by the sum of the squares of its digits.
Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy.
Return true if n is a happy number, and false if not.



Example 1:

Input: n = 19
Output: true
Explanation:
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1
Example 2:

Input: n = 2
Output: false


Constraints:

1 <= n <= 231 - 1
     */
    public static boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        while (n!=1 && !seen.contains(n) ){
            seen.add(n);
            List<Integer> result = splitInteger(n);
            n = 0;
            for(int i : result){
                n+=(i*i);
            }

        }
        return n==1;
    }

    public static List<Integer> splitInteger(int n){
        String intStr = Integer.toString(n);
        List<Integer> result = new ArrayList<>();
        for (char ch : intStr.toCharArray()){
            result.add(Character.getNumericValue(ch));
        }
        return result;
    }
    public static void main(String[] args) {
        int n = 1111;
        System.out.println(isHappy(n));
    }
}
