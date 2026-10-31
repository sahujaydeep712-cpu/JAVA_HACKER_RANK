import java.util.Scanner;

/**
 * Problem: Java Stdin and Stdout I
 * Domain: Java / Introduction
 * Author: Jaydeep Sahu (github.com/sahujaydeep712-cpu)
 *
 * Description:
 * Read 3 integers from STDIN using Scanner and print each integer on a new line to STDOUT.
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */
public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read three space/newline-separated integers from standard input
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();

        scanner.close();

        // Print each integer on a distinct line
        System.out.println(firstNumber);
        System.out.println(secondNumber);
        System.out.println(thirdNumber);
    }
}
