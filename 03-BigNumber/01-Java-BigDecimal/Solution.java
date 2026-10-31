import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Problem: Java BigDecimal
 * Domain: Java / BigNumber
 * Author: Jaydeep Sahu (github.com/sahujaydeep712-cpu)
 *
 * Description:
 * Given an array of n real number strings, sort them in descending order
 * by their numerical values while preserving their original string representations
 * (including trailing zeros, decimal format).
 *
 * Time Complexity: O(n log n)
 * Space Complexity: O(n)
 */
public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] s = new String[n + 2];

        for (int i = 0; i < n; i++) {
            s[i] = scanner.next();
        }
        scanner.close();

        // Sort elements 0 to n in descending numerical order
        Arrays.sort(s, 0, n, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                BigDecimal bd1 = new BigDecimal(s1);
                BigDecimal bd2 = new BigDecimal(s2);
                // Descending order: compare bd2 to bd1
                return bd2.compareTo(bd1);
            }
        });

        // Print sorted strings
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}
