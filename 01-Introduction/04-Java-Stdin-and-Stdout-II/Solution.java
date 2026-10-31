import java.util.Scanner;

/**
 * Problem: Java Stdin and Stdout II
 * Domain: Java / Introduction
 * Author: Jaydeep Sahu (github.com/sahujaydeep712-cpu)
 *
 * Description:
 * Read an integer, a double, and a String from STDIN.
 * Note: Must handle consuming the trailing newline character left by nextDouble()
 * before reading nextLine().
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */
public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int integerVal = scanner.nextInt();
        double doubleVal = scanner.nextDouble();

        // Consume remaining newline in the buffer before reading next full line
        scanner.nextLine();
        String stringVal = scanner.nextLine();

        scanner.close();

        // Print outputs in specified reversed order
        System.out.println("String: " + stringVal);
        System.out.println("Double: " + doubleVal);
        System.out.println("Int: " + integerVal);
    }
}
