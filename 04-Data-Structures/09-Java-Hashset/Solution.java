import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Problem: Java Hashset
 * Domain: Java / Data Structures
 * Author: Jaydeep Sahu (github.com/sahujaydeep712-cpu)
 *
 * Description:
 * Maintain a set of unique pairs (first_name, second_name).
 * After each pair is inserted, print the number of unique pairs in the set.
 *
 * Time Complexity: O(1) amortized per insertion
 * Space Complexity: O(T)
 */
public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        String[] pair_left = new String[t];
        String[] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = scanner.next();
            pair_right[i] = scanner.next();
        }
        scanner.close();

        Set<String> uniquePairs = new HashSet<>();

        for (int i = 0; i < t; i++) {
            uniquePairs.add(pair_left[i] + " " + pair_right[i]);
            System.out.println(uniquePairs.size());
        }
    }
}
