import java.util.Scanner;

/**
 * Problem: Java Output Formatting
 * Domain: Java / Introduction
 * Author: Jaydeep Sahu (github.com/sahujaydeep712-cpu)
 *
 * Description:
 * Format input consisting of a String and an integer.
 * The String should be left-justified within 15 characters,
 * and the integer padded with leading zeros to 3 digits (% -15s%03d%n).
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */
public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String text = scanner.next();
            int number = scanner.nextInt();

            // %-15s: left-aligned 15 characters string
            // %03d: zero-padded integer up to 3 digits
            System.out.printf("%-15s%03d%n", text, number);
        }
        System.out.println("================================");

        scanner.close();
    }
}
