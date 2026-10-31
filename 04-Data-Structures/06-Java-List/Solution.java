import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Problem: Java List
 * Domain: Java / Data Structures
 * Author: Jaydeep Sahu (github.com/sahujaydeep712-cpu)
 *
 * Description:
 * Perform two types of queries on a list of integers:
 * 1. Insert x at index y
 * 2. Delete element at index x
 * Finally, print the modified list elements separated by space.
 *
 * Time Complexity: O(q * n)
 * Space Complexity: O(n)
 */
public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }

        int queries = scanner.nextInt();
        for (int i = 0; i < queries; i++) {
            String queryType = scanner.next();
            if ("Insert".equalsIgnoreCase(queryType)) {
                int index = scanner.nextInt();
                int value = scanner.nextInt();
                list.add(index, value);
            } else if ("Delete".equalsIgnoreCase(queryType)) {
                int index = scanner.nextInt();
                list.remove(index);
            }
        }
        scanner.close();

        // Print final list contents
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + (i == list.size() - 1 ? "" : " "));
        }
        System.out.println();
    }
}
