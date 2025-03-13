package com.vishal.Technique.Diff_Arr_Tech;

/**
 * Range Addition Problem

 * Problem Description:
 * You are given an array of length n, initialized with all 0's and a list of operations.
 * Each operation is an instruction to add a value at a specific range in the array.
 * After all operations, you need to return the resulting array.

 * Example:
 * Input: length = 5, updates = [[1,3,2],[2,4,3],[0,2,-2]]
 * Output: [-2,0,3,5,3]

 * Explanation:
 * Initial state: [0,0,0,0,0]
 * After operation [1,3,2]: [0,2,2,2,0]
 * After operation [2,4,3]: [0,2,5,5,3]
 * After operation [0,2,-2]: [-2,0,3,5,3]
 */
public class RangeAddition {

    /**
     * Adds values to ranges in the array according to the update operations
     *
     * @param length - the length of the array
     * @param updates - array of update operations where each operation is [startIndex, endIndex, value]
     * @return the final array after all update operations
     */
    public int[] getModifiedArray(int length, int[][] updates) {
        // TODO: Implement this method
        // Hint: Consider using a prefix sum approach for optimal efficiency
        int[] diff = new int[length];

        for(int[] update : updates){
            int start = update[0];
            int end = update[1];
            int x = update[2];

            diff[start] += x;
            if(end + 1 < length){
                diff[end + 1] -= x;
            }
        }

        int cumSum = 0;
        for(int i=0; i<diff.length; i++){
            cumSum += diff[i];
            diff[i] = cumSum;
        }
        return diff;
    }

    // Test cases
    public static void main(String[] args) {
        RangeAddition solution = new RangeAddition();

        // Test case 1
        int length1 = 5;
        int[][] updates1 = {{1, 3, 2}, {2, 4, 3}, {0, 2, -2}};
        int[] result1 = solution.getModifiedArray(length1, updates1);
        printArray("Test case 1 result:", result1);

        // Test case 2
        int length2 = 10;
        int[][] updates2 = {{2, 4, 6}, {5, 6, 8}, {1, 9, -4}};
        int[] result2 = solution.getModifiedArray(length2, updates2);
        printArray("Test case 2 result:", result2);
    }

    // Helper method to print array
    private static void printArray(String message, int[] arr) {
        System.out.print(message + " [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}