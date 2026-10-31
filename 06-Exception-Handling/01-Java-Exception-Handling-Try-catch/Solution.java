import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Problem: Java Exception Handling (Try-catch)
 * Domain: Java / Exception Handling
 * Author: Jaydeep Sahu (github.com/sahujaydeep712-cpu)
 *
 * Description:
 * Read two integers x and y and compute x / y.
 * Handle two exceptions:
 * 1. InputMismatchException: If input is not a 32-bit signed integer.
 * 2. ArithmeticException: If y == 0 (division by zero).
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */
public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int result = x / y;
            System.out.println(result);
        } catch (InputMismatchException e) {
            System.out.println("java.util.InputMismatchException");
        } catch (ArithmeticException e) {
            System.out.println(e.toString());
        } finally {
            scanner.close();
        }
    }
}
