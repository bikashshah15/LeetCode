package com.example.test.solutions;

public class Solution1556 {
    /*
    1556. Thousand Separator
Solved
Easy
Topics
Companies
Hint
Given an integer n, add a dot (".") as the thousands separator and return it in string format.



Example 1:

Input: n = 987
Output: "987"
Example 2:

Input: n = 1234
Output: "1.234"
     */
    public static String thousandSeparator(int n) {
        String s = new StringBuilder(Integer.toString(n)).reverse().toString();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i+=3) {
            String subStr = s.substring(i,Math.min(s.length(),i+3));
            sb.append(subStr);
            if(s.length() - i > 3)
                sb.append(".");
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        int n = 123434;
        System.out.println(thousandSeparator(n));
    }
}
