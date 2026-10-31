import java.util.Scanner;

/**
 * Problem: Java 1D Array
 * Domain: Java / Data Structures
 * Author: Jaydeep Sahu (github.com/sahujaydeep712-cpu)
 *
 * Description:
 * Read an integer n from STDIN, create an array of n integers,
 * populate it with n values, and print each element on a new line.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        scan.close();

        // Print each array element
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
