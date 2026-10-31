import java.math.BigInteger;
import java.util.Scanner;

/**
 * Problem: Java Primality Test
 * Domain: Java / BigNumber
 * Author: Jaydeep Sahu (github.com/sahujaydeep712-cpu)
 *
 * Description:
 * Given a large decimal integer with up to 100 digits,
 * determine whether it is prime or not using BigInteger.isProbablePrime(certainty).
 *
 * Time Complexity: O(k * log^3(n)) with Miller-Rabin test
 * Space Complexity: O(digits)
 */
public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numberString = scanner.next();
        scanner.close();

        BigInteger bigInt = new BigInteger(numberString);

        // Certainty of 100 gives probability > 1 - (1/2)^100 of being correct
        if (bigInt.isProbablePrime(100)) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }
}
