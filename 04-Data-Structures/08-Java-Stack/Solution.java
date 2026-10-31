import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 * Problem: Java Stack
 * Domain: Java / Data Structures
 * Author: Jaydeep Sahu (github.com/sahujaydeep712-cpu)
 *
 * Description:
 * Check if a string of brackets ('()', '{}', '[]') is balanced.
 * Uses Deque as an efficient stack implementation.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
public class Solution {

    private static boolean isBalanced(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String input = scanner.next();
            System.out.println(isBalanced(input));
        }

        scanner.close();
    }
}
