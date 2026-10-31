import java.util.Scanner;

/**
 * Problem: Java 2D Array
 * Domain: Java / Data Structures
 * Author: Jaydeep Sahu (github.com/sahujaydeep712-cpu)
 *
 * Description:
 * Given a 6x6 2D array, calculate the hourglass sum for every hourglass
 * in the array and print the maximum hourglass sum.
 *
 * Hourglass pattern:
 * a b c
 *   d
 * e f g
 *
 * Time Complexity: O(R * C) where R=6, C=6 -> 16 hourglass calculations
 * Space Complexity: O(1) auxiliary
 */
public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[6][6];

        for (int row = 0; row < 6; row++) {
            for (int col = 0; col < 6; col++) {
                matrix[row][col] = scanner.nextInt();
            }
        }
        scanner.close();

        int maxHourglassSum = Integer.MIN_VALUE;

        // An hourglass starts at (row, col) with bounds row <= 3, col <= 3
        for (int row = 0; row <= 3; row++) {
            for (int col = 0; col <= 3; col++) {
                int currentSum = matrix[row][col] + matrix[row][col + 1] + matrix[row][col + 2]
                               + matrix[row + 1][col + 1]
                               + matrix[row + 2][col] + matrix[row + 2][col + 1] + matrix[row + 2][col + 2];

                if (currentSum > maxHourglassSum) {
                    maxHourglassSum = currentSum;
                }
            }
        }

        System.out.println(maxHourglassSum);
    }
}
