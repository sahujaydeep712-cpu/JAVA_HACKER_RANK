import java.util.Scanner;

/**
 * Problem: Java Substring Comparisons
 * Domain: Java / Strings
 * Author: Jaydeep Sahu (github.com/sahujaydeep712-cpu)
 *
 * Description:
 * Given a string s and an integer k, find the lexicographically smallest
 * and largest substrings of length k.
 *
 * Time Complexity: O(n * k) where n = s.length()
 * Space Complexity: O(k)
 */
public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        // Slide window of length k across the string
        for (int i = 1; i <= s.length() - k; i++) {
            String currentSub = s.substring(i, i + k);
            if (currentSub.compareTo(smallest) < 0) {
                smallest = currentSub;
            }
            if (currentSub.compareTo(largest) > 0) {
                largest = currentSub;
            }
        }

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int k = scanner.nextInt();
        scanner.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
