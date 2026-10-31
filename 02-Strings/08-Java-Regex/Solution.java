import java.util.Scanner;

/**
 * Problem: Java Regex
 * Domain: Java / Strings
 * Author: Jaydeep Sahu (github.com/sahujaydeep712-cpu)
 *
 * Description:
 * Write a regular expression to validate IPv4 addresses.
 * IP address format: A.B.C.D where A, B, C, D are integers in range [0, 255].
 * Leading zeros allowed up to 3 digits (e.g. 000 to 255).
 *
 * Time Complexity: O(L) per test case
 * Space Complexity: O(1)
 */
class MyRegex {
    // Matches 0-199 or 200-249 or 250-255 with optional leading zeros
    private static final String ZERO_TO_255 = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
    public final String pattern = "^(" + ZERO_TO_255 + "\\.){3}" + ZERO_TO_255 + "$";
}

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String ip = in.next();
            System.out.println(ip.matches(new MyRegex().pattern));
        }
        in.close();
    }
}
