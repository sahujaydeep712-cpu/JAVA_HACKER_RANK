import java.util.Scanner;

/**
 * Problem: Java String Tokens
 * Domain: Java / Strings
 * Author: Jaydeep Sahu (github.com/sahujaydeep712-cpu)
 *
 * Description:
 * Given a string s matching regex [A-Za-z !,?._'@]+, split the string into
 * tokens based on delimiters [ !,?._'@]+.
 * Print the number of tokens followed by each token on a new line.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextLine()) {
            System.out.println(0);
            scanner.close();
            return;
        }

        String input = scanner.nextLine().trim();
        scanner.close();

        // Edge case: empty or whitespace-only input
        if (input.isEmpty()) {
            System.out.println(0);
            return;
        }

        // Split by one or more non-alphanumeric punctuation/whitespace delimiters
        String[] tokens = input.split("[^A-Za-z]+");

        // Filter potential leading empty token if input starts with delimiter
        int validCount = 0;
        for (String token : tokens) {
            if (!token.isEmpty()) {
                validCount++;
            }
        }

        System.out.println(validCount);
        for (String token : tokens) {
            if (!token.isEmpty()) {
                System.out.println(token);
            }
        }
    }
}
