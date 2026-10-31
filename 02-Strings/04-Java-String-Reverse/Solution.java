import java.util.Scanner;

/**
 * Problem: Java String Reverse
 * Domain: Java / Strings
 * Author: Jaydeep Sahu (github.com/sahujaydeep712-cpu)
 *
 * Description:
 * Given a string A, determine if it is a palindrome.
 * Print "Yes" if it is, otherwise print "No".
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        scanner.close();

        // Check palindrome via two pointers or StringBuilder reversal
        int left = 0;
        int right = input.length() - 1;
        boolean isPalindrome = true;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        System.out.println(isPalindrome ? "Yes" : "No");
    }
}
