import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Problem: Java Currency Formatter
 * Domain: Java / Introduction
 * Author: Jaydeep Sahu (github.com/sahujaydeep712-cpu)
 *
 * Description:
 * Format a double-precision number as currency for:
 * - US ($)
 * - India (Rs. / INR with custom en-IN locale)
 * - China (¥)
 * - France (with non-breaking space and trailing €)
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */
public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Standard locales
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        // Custom India Locale (en_IN)
        Locale indiaLocale = new Locale("en", "IN");
        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(indiaLocale);

        // Print formatted currency strings
        System.out.println("US: " + usFormat.format(payment));
        System.out.println("India: " + indiaFormat.format(payment));
        System.out.println("China: " + chinaFormat.format(payment));
        System.out.println("France: " + franceFormat.format(payment));
    }
}
