import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * Problem: Pattern Syntax Checker
 * Domain: Java / Strings
 * Author: Jaydeep Sahu (github.com/sahujaydeep712-cpu)
 *
 * Description:
 * Validate regular expressions. If a regex compiles without exception,
 * print "Valid", otherwise print "Invalid".
 *
 * Time Complexity: O(t * L) where L is pattern length
 * Space Complexity: O(L)
 */
public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = Integer.parseInt(scanner.nextLine());

        while (testCases > 0) {
            String patternString = scanner.nextLine();
            try {
                // Attempt to compile the regex pattern
                Pattern.compile(patternString);
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }
            testCases--;
        }

        scanner.close();
    }
}
