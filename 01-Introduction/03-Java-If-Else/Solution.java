import java.util.Scanner;

/**
 * Problem: Java If-Else
 * Domain: Java / Introduction
 * Author: Jaydeep Sahu (github.com/sahujaydeep712-cpu)
 *
 * Description:
 * Conditional logic based on integer value N:
 * - If N is odd, print "Weird"
 * - If N is even and between 2 and 5 (inclusive), print "Not Weird"
 * - If N is even and between 6 and 20 (inclusive), print "Weird"
 * - If N is even and > 20, print "Not Weird"
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */
public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        // Evaluate conditional requirements
        if (n % 2 != 0) {
            // Odd numbers are always Weird
            System.out.println("Weird");
        } else {
            // Even numbers checked against range conditions
            if (n >= 2 && n <= 5) {
                System.out.println("Not Weird");
            } else if (n >= 6 && n <= 20) {
                System.out.println("Weird");
            } else {
                System.out.println("Not Weird");
            }
        }
    }
}
