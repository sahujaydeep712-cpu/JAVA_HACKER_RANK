import java.util.Scanner;

/**
 * Problem: Java Subarray
 * Domain: Java / Data Structures
 * Author: Jaydeep Sahu (github.com/sahujaydeep712-cpu)
 *
 * Description:
 * Given an array of n integers, find and print the number of
 * negative subarrays (subarrays whose elements sum to < 0).
 *
 * Time Complexity: O(n^2)
 * Space Complexity: O(n)
 */
public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        int negativeSubarrayCount = 0;

        // Iterate over all possible starting positions
        for (int start = 0; start < n; start++) {
            int runningSum = 0;
            for (int end = start; end < n; end++) {
                runningSum += arr[end];
                if (runningSum < 0) {
                    negativeSubarrayCount++;
                }
            }
        }

        System.out.println(negativeSubarrayCount);
    }
}
