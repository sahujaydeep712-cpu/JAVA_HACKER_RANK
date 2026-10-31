import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Problem: Tag Content Extractor
 * Domain: Java / Strings
 * Author: Jaydeep Sahu (github.com/sahujaydeep712-cpu)
 *
 * Description:
 * Extract valid text between matching HTML/XML tags.
 * A tag cannot have empty or nested invalid tags.
 *
 * Regex: <(.+)>([^<]+)</\1>
 * - <(.+)> : captures opening tag name in group 1
 * - ([^<]+) : captures tag content (must not contain any '<' tag openings) in group 2
 * - </\1>  : matches closing tag with same name as group 1
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        String regex = "<(.+)>([^<]+)</\\1>";
        Pattern pattern = Pattern.compile(regex);

        while (testCases > 0) {
            String line = in.nextLine();
            Matcher matcher = pattern.matcher(line);
            boolean matchFound = false;

            while (matcher.find()) {
                System.out.println(matcher.group(2));
                matchFound = true;
            }

            if (!matchFound) {
                System.out.println("None");
            }

            testCases--;
        }

        in.close();
    }
}
