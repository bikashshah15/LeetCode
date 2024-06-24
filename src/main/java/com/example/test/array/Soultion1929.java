package com.example.test.array;

import java.util.Arrays;

public class Soultion1929 {
    public static int[] getConcatenation(int[] nums) {
        int[] ans = new int[2*nums.length];
        for (int i = 0; i < ans.length; i++) {
            if(i<nums.length)
                ans[i] = nums[i];
            else
                ans[i] = nums[i-nums.length];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }
}
