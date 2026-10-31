import java.math.BigInteger;
import java.util.Scanner;

/**
 * Problem: Java BigInteger
 * Domain: Java / BigNumber
 * Author: Jaydeep Sahu (github.com/sahujaydeep712-cpu)
 *
 * Description:
 * In this problem, you have to add and multiply huge numbers!
 * These numbers are so big that you can't contain them in any ordinary data types like a long integer.
 * Use Java's BigInteger class to calculate sum and product.
 *
 * Time Complexity: O(digits^2) for multiplication, O(digits) for addition
 * Space Complexity: O(digits)
 */
public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger firstNumber = new BigInteger(scanner.next());
        BigInteger secondNumber = new BigInteger(scanner.next());
        scanner.close();

        // Calculate and print sum and product
        BigInteger sum = firstNumber.add(secondNumber);
        BigInteger product = firstNumber.multiply(secondNumber);

        System.out.println(sum);
        System.out.println(product);
    }
}
