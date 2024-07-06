package com.example.test.solutions;

import java.util.Arrays;
import java.util.List;

public class Solution345 {
    /*
    345. Reverse Vowels of a String
Solved
Easy
Topics
Companies
Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.



Example 1:

Input: s = "hello"
Output: "holle"
Example 2:

Input: s = "leetcode"
Output: "leotcede"


Constraints:

1 <= s.length <= 3 * 105
s consist of printable ASCII characters.
     */
    public static String reverseVowels(String s) {
        List<Character> list = List.of('a','e','i','o','u','A','E','I','O','U');
        char[] chars = s.toCharArray();
        int left = 0; int right = s.length()-1;
        while (left<right){
            while (left <right && !list.contains(chars[left])){
                left ++;
            }
            while (left <right && !list.contains(chars[right])){
                right --;
            }
            if(left < right){
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;right--;
            }
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(reverseVowels(s));
    }
}
