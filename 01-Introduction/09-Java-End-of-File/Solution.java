import java.util.Scanner;

/**
 * Problem: Java End-of-file
 * Domain: Java / Introduction
 * Author: Jaydeep Sahu (github.com/sahujaydeep712-cpu)
 *
 * Description:
 * Read unknown lines of input until standard EOF (End-of-file).
 * Output each line prefixed by its 1-indexed line number: "lineNum lineContent".
 *
 * Time Complexity: O(N) where N is total characters in input
 * Space Complexity: O(1) auxiliary
 */
public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lineNumber = 1;

        // Process standard input continuously until EOF
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(lineNumber + " " + line);
            lineNumber++;
        }

        scanner.close();
    }
}
