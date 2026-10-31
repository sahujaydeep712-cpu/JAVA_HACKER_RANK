import java.util.Scanner;

/**
 * Problem: Java Strings Introduction
 * Domain: Java / Strings
 * Author: Jaydeep Sahu (github.com/sahujaydeep712-cpu)
 *
 * Description:
 * Given two strings A and B:
 * 1. Sum the lengths of A and B.
 * 2. Determine if A is lexicographically larger than B ("Yes" or "No").
 * 3. Capitalize the first letter in both A and B and print them on a single line separated by space.
 *
 * Time Complexity: O(|A| + |B|)
 * Space Complexity: O(|A| + |B|)
 */
public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String strA = scanner.next();
        String strB = scanner.next();
        scanner.close();

        // 1. Total length
        System.out.println(strA.length() + strB.length());

        // 2. Lexicographical comparison
        if (strA.compareTo(strB) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // 3. Capitalize first letter of each string
        String capA = strA.substring(0, 1).toUpperCase() + strA.substring(1);
        String capB = strB.substring(0, 1).toUpperCase() + strB.substring(1);
        System.out.println(capA + " " + capB);
    }
}
