import java.util.Scanner;

/**
 * Problem: Java Substring
 * Domain: Java / Strings
 * Author: Jaydeep Sahu (github.com/sahujaydeep712-cpu)
 *
 * Description:
 * Given a string s and two indices start and end, print a substring
 * consisting of all characters in the inclusive range from start to end - 1.
 *
 * Time Complexity: O(end - start)
 * Space Complexity: O(end - start)
 */
public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String originalString = scanner.next();
        int startIndex = scanner.nextInt();
        int endIndex = scanner.nextInt();
        scanner.close();

        // Substring from startIndex (inclusive) to endIndex (exclusive)
        String extractedSubstring = originalString.substring(startIndex, endIndex);
        System.out.println(extractedSubstring);
    }
}
