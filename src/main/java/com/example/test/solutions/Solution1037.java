package com.example.test.solutions;

import java.util.Arrays;

public class Solution1037 {
    /*
    1037. Valid Boomerang
Solved
Easy
Topics
Companies
Hint
Given an array points where points[i] = [xi, yi] represents a point on the X-Y plane, return true if these points are a boomerang.

A boomerang is a set of three points that are all distinct and not in a straight line.



Example 1:

Input: points = [[1,1],[2,3],[3,2]]
Output: true
Example 2:

Input: points = [[1,1],[2,2],[3,3]]
Output: false


Constraints:

points.length == 3
points[i].length == 2
0 <= xi, yi <= 100
     */
    public static boolean isBoomerang(int[][] points) {
        if(Arrays.equals(points[0], points[1]) || Arrays.equals(points[1],points[2]) || Arrays.equals(points[0], points[2]))
            return false;
        double m1 =0.0, m2 = 0.0;
        if((points[1][0] != points[0][0]))
             m1 = (double) (points[1][1] - points[0][1]) /(points[1][0] - points[0][0]);
        else
            m1 = Double.POSITIVE_INFINITY;
        if((points[2][0] != points[1][0]))
            m2 = (double) (points[2][1] - points[1][1]) /(points[2][0] - points[1][0]);
        else
            m2 = Double.POSITIVE_INFINITY;


        return m1 != m2;
    }

    public static void main(String[] args) {
        int[][] points = {{1,1},{1,1},{3,3}};
        System.out.println(isBoomerang(points));
    }
}
