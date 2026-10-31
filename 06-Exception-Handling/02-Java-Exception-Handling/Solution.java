import java.util.Scanner;

/**
 * Problem: Java Exception Handling
 * Domain: Java / Exception Handling
 * Author: Jaydeep Sahu (github.com/sahujaydeep712-cpu)
 *
 * Description:
 * Create class MyCalculator with method long power(int n, int p).
 * If either n or p is negative: throw Exception("n or p should not be negative.")
 * If both n and p are zero: throw Exception("n and p should not be zero.")
 * Otherwise compute n^p.
 *
 * Time Complexity: O(p) or O(log p)
 * Space Complexity: O(1)
 */
class MyCalculator {
    public long power(int n, int p) throws Exception {
        if (n < 0 || p < 0) {
            throw new Exception("n or p should not be negative.");
        }
        if (n == 0 && p == 0) {
            throw new Exception("n and p should not be zero.");
        }

        long result = 1;
        for (int i = 0; i < p; i++) {
            result *= n;
        }
        return result;
    }
}

public class Solution {
    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (in.hasNextInt()) {
            int n = in.nextInt();
            int p = in.nextInt();

            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
