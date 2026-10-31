import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Problem: Java Map
 * Domain: Java / Data Structures
 * Author: Jaydeep Sahu (github.com/sahujaydeep712-cpu)
 *
 * Description:
 * Implement a phone book using a HashMap.
 * For each query name, print "name=phoneNumber", or "Not found"
 * if the name does not exist in the phone book.
 *
 * Time Complexity: O(1) average lookup per query
 * Space Complexity: O(n)
 */
public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int entries = scanner.nextInt();
        scanner.nextLine(); // consume newline

        Map<String, Integer> phoneBook = new HashMap<>();

        for (int i = 0; i < entries; i++) {
            String name = scanner.nextLine();
            int phone = scanner.nextInt();
            scanner.nextLine(); // consume newline
            phoneBook.put(name, phone);
        }

        // Query processing until EOF
        while (scanner.hasNextLine()) {
            String query = scanner.nextLine();
            if (phoneBook.containsKey(query)) {
                System.out.println(query + "=" + phoneBook.get(query));
            } else {
                System.out.println("Not found");
            }
        }

        scanner.close();
    }
}
