import java.util.ArrayList;
import java.util.Scanner;

/**
 * Problem: Java ArrayList
 * Domain: Java / Data Structures
 * Author: Jaydeep Sahu (github.com/sahujaydeep712-cpu)
 *
 * Description:
 * Given n lines of integers, store each row in an ArrayList<ArrayList<Integer>>.
 * Answer q queries asking for the element at row x, column y (1-indexed).
 * If the position does not exist, print "ERROR!".
 *
 * Time Complexity: O(N + q)
 * Space Complexity: O(N)
 */
public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        ArrayList<ArrayList<Integer>> rows = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            int size = scanner.nextInt();
            ArrayList<Integer> row = new ArrayList<>(size);
            for (int j = 0; j < size; j++) {
                row.add(scanner.nextInt());
            }
            rows.add(row);
        }

        int queries = scanner.nextInt();
        for (int k = 0; k < queries; k++) {
            int x = scanner.nextInt() - 1; // 0-indexed row
            int y = scanner.nextInt() - 1; // 0-indexed col

            if (x >= 0 && x < rows.size() && y >= 0 && y < rows.get(x).size()) {
                System.out.println(rows.get(x).get(y));
            } else {
                System.out.println("ERROR!");
            }
        }

        scanner.close();
    }
}
