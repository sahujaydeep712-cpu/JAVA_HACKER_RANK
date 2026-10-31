import java.util.Scanner;

/**
 * Problem: Java Datatypes
 * Domain: Java / Introduction
 * Author: Jaydeep Sahu (github.com/sahujaydeep712-cpu)
 *
 * Description:
 * Given an integer number, determine which primitive data types (byte, short, int, long)
 * can store it. If it cannot fit in a 64-bit signed long, print that it can't be fitted anywhere.
 *
 * Ranges:
 * - byte: [-128, 127]
 * - short: [-32,768, 32,767]
 * - int: [-2^31, 2^31 - 1]
 * - long: [-2^63, 2^63 - 1]
 *
 * Time Complexity: O(t)
 * Space Complexity: O(1)
 */
public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();

        for (int i = 0; i < testCases; i++) {
            try {
                long num = scanner.nextLong();
                System.out.println(num + " can be fitted in:");

                if (num >= Byte.MIN_VALUE && num <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                if (num >= Short.MIN_VALUE && num <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (num >= Integer.MIN_VALUE && num <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                if (num >= Long.MIN_VALUE && num <= Long.MAX_VALUE) {
                    System.out.println("* long");
                }
            } catch (Exception e) {
                // If token exceeds 64-bit integer range
                System.out.println(scanner.next() + " can't be fitted anywhere.");
            }
        }

        scanner.close();
    }
}
