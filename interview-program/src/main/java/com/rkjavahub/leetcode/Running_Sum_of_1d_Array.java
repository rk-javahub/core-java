package com.rkjavahub.leetcode;

import java.util.Arrays;

/*
Example 1:

Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].

time complexity = O(n)
space complexity = O(1)
 */
public class Running_Sum_of_1d_Array {

    public static int[] sumOf1DArray(int[] inputArray) {
        int[] result = new int[inputArray.length];
        result[0] = inputArray[0];

        for (int i = 1; i < inputArray.length; i++) {
            result[i] = inputArray[i] + result[i - 1];
            System.out.println(result[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 4};

        int[] result = sumOf1DArray(inputArray);

        System.out.println(Arrays.toString(result));

    }
}
