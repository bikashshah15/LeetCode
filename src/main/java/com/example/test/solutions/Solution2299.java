package com.example.test.solutions;

public class Solution2299 {
    /*
    2299. Strong Password Checker II
Solved
Easy
Topics
Companies
Hint
A password is said to be strong if it satisfies all the following criteria:

It has at least 8 characters.
It contains at least one lowercase letter.
It contains at least one uppercase letter.
It contains at least one digit.
It contains at least one special character. The special characters are the characters in the following string: "!@#$%^&*()-+".
It does not contain 2 of the same character in adjacent positions (i.e., "aab" violates this condition, but "aba" does not).
Given a string password, return true if it is a strong password. Otherwise, return false.



Example 1:

Input: password = "IloveLe3tcode!"
Output: true
Explanation: The password meets all the requirements. Therefore, we return true.
Example 2:

Input: password = "Me+You--IsMyDream"
Output: false
Explanation: The password does not contain a digit and also contains 2 of the same character in adjacent positions. Therefore, we return false.
Example 3:

Input: password = "1aB!"
Output: false
Explanation: The password does not meet the length requirement. Therefore, we return false.


Constraints:

1 <= password.length <= 100
password consists of letters, digits, and special characters: "!@#$%^&*()-+".
     */
    public static boolean strongPasswordCheckerII(String password) {
        boolean is8= false, isLower= false, isUpper= false, isDigit= false, isSpecial = false,noConcurrent = true;

        String specialChar = "!@#$%^&*()-+";
        if(password.length() >= 8)
            is8 = true;

        char prev = password.charAt(0);
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if(Character.isLowerCase(ch))
                isLower = true;
            if(Character.isUpperCase(ch))
                isUpper = true;
            if(Character.isDigit(ch))
                isDigit = true;
            if(specialChar.contains(ch+""))
                isSpecial = true;
            if(i>0 && prev == ch)
                noConcurrent = false;
            prev = ch;
        }
        return is8 && isLower && isUpper && isDigit && isSpecial && noConcurrent;
    }

    public static void main(String[] args) {
        String password = "Me+You--IsMyDream";
        System.out.println(strongPasswordCheckerII(password));
    }
}
