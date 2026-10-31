import java.util.Scanner;

/**
 * Problem: Java Loops I
 * Domain: Java / Introduction
 * Author: Jaydeep Sahu (github.com/sahujaydeep712-cpu)
 *
 * Description:
 * Given an integer N, print its first 10 multiples in the format:
 * N x i = result (for i from 1 to 10).
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */
public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        // Generate multiplication table from 1 to 10
        for (int multiplier = 1; multiplier <= 10; multiplier++) {
            int product = n * multiplier;
            System.out.printf("%d x %d = %d%n", n, multiplier, product);
        }
    }
}
