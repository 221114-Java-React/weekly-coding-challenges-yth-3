package com.revature.problem1;

public class Solution {
    public int elementNotInArray(int[] arr, int k) {
        int smallestGreaterThanK = k + 1;
        for (int i : arr) {
            if (i == smallestGreaterThanK) {
                smallestGreaterThanK++;
            }
        }

        return smallestGreaterThanK;
    }
}
