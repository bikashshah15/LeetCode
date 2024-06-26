package com.example.test.solutions;

import java.util.ArrayList;

import java.util.List;

public class Solution118 {
    /*
    118. Pascal's Triangle
Solved
Easy
Topics
Companies
Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:




Example 1:

Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
Example 2:

Input: numRows = 1
Output: [[1]]


Constraints:

1 <= numRows <= 30
     */
    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> pascalTriangle = new ArrayList<>();
        if(numRows <= 0)
            return pascalTriangle;
        pascalTriangle.add(new ArrayList<>());
        pascalTriangle.get(0).add(1);

        for (int i = 1; i < numRows; i++) {
            List<Integer> rows = new ArrayList<>();
            List<Integer> prevRow = pascalTriangle.get(i-1);

            rows.add(1);
            for (int j = 1; j < i ; j++) {
                rows.add(prevRow.get(j-1)+prevRow.get(j));
            }
            rows.add(1);
            pascalTriangle.add(rows);
        }
        return pascalTriangle;
    }

    public static void main(String[] args) {
        int numRows = 9;
        System.out.println(generate(numRows));
    }
}
