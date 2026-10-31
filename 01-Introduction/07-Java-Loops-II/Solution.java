import java.util.Scanner;

/**
 * Problem: Java Loops II
 * Domain: Java / Introduction
 * Author: Jaydeep Sahu (github.com/sahujaydeep712-cpu)
 *
 * Description:
 * For each query (a, b, n), print the series:
 * s0 = a + 2^0 * b
 * s1 = a + 2^0 * b + 2^1 * b
 * ...
 * sn-1 = a + 2^0 * b + ... + 2^(n-1) * b
 *
 * Time Complexity: O(q * n)
 * Space Complexity: O(1)
 */
public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int queries = scanner.nextInt();

        for (int q = 0; q < queries; q++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();

            int currentSum = a;
            int powerOfTwo = 1;

            for (int j = 0; j < n; j++) {
                currentSum += powerOfTwo * b;
                System.out.print(currentSum + (j == n - 1 ? "" : " "));
                powerOfTwo *= 2;
            }
            System.out.println();
        }

        scanner.close();
    }
}
