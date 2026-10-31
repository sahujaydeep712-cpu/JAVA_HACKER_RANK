import java.util.Scanner;

/**
 * Problem: Java Anagrams
 * Domain: Java / Strings
 * Author: Jaydeep Sahu (github.com/sahujaydeep712-cpu)
 *
 * Description:
 * Check if two strings a and b are case-insensitive anagrams.
 * Uses character frequency counting (array of size 26).
 *
 * Time Complexity: O(|a| + |b|)
 * Space Complexity: O(1) auxiliary (fixed alphabet size 26)
 */
public class Solution {

    static boolean isAnagram(String a, String b) {
        if (a == null || b == null || a.length() != b.length()) {
            return false;
        }

        String lowerA = a.toLowerCase();
        String lowerB = b.toLowerCase();

        int[] frequencyMap = new int[26];

        for (int i = 0; i < lowerA.length(); i++) {
            frequencyMap[lowerA.charAt(i) - 'a']++;
            frequencyMap[lowerB.charAt(i) - 'a']--;
        }

        for (int count : frequencyMap) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        scanner.close();

        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
