package com.example.test.solutions;

public class Solution258 {
    /*
    258. Add Digits
Solved
Easy
Topics
Companies
Hint
Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.



Example 1:

Input: num = 38
Output: 2
Explanation: The process is
38 --> 3 + 8 --> 11
11 --> 1 + 1 --> 2
Since 2 has only one digit, return it.
Example 2:

Input: num = 0
Output: 0


Constraints:

0 <= num <= 231 - 1
     */
    public static int addDigits(int num) {

        while (num > 9){
            String str = Integer.toString(num);
            int sum = 0;
            for (char ch: str.toCharArray()){
                sum += Character.getNumericValue(ch);
            }
            num = sum;
        }
        return num;
    }

    public static void main(String[] args) {
        int num = 38;
        System.out.println(addDigits(num));
    }
}
