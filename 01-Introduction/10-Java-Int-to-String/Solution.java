import java.util.Scanner;

/**
 * Problem: Java Int to String
 * Domain: Java / Introduction
 * Author: Jaydeep Sahu (github.com/sahujaydeep712-cpu)
 *
 * Description:
 * Convert integer n into its String representation.
 * If successful, prints "Good job", otherwise "Wrong answer".
 *
 * Time Complexity: O(log10(N))
 * Space Complexity: O(1)
 */
public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        // Convert integer to string using standard Integer utility
        String convertedString = Integer.toString(n);

        if (n == Integer.parseInt(convertedString)) {
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer.");
        }
    }
}
