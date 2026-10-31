import java.util.Scanner;

/**
 * Problem: Valid Username Regular Expression
 * Domain: Java / Strings
 * Author: Jaydeep Sahu (github.com/sahujaydeep712-cpu)
 *
 * Description:
 * A username is considered valid if:
 * 1. Length is between 8 and 30 characters inclusive.
 * 2. It begins with an alphabetic character (a-z or A-Z).
 * 3. It contains only alphanumeric characters and underscores (_).
 *
 * Time Complexity: O(L) per test case
 * Space Complexity: O(1)
 */
class UsernameValidator {
    public static final String regularExpression = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
}

public class Solution {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}
