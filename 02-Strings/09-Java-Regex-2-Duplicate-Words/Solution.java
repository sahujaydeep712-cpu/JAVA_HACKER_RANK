import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Problem: Java Regex 2 - Duplicate Words
 * Domain: Java / Strings
 * Author: Jaydeep Sahu (github.com/sahujaydeep712-cpu)
 *
 * Description:
 * Use regular expressions to remove consecutive duplicate words case-insensitively,
 * retaining only the first occurrence of each word.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
public class Solution {

    public static void main(String[] args) {
        // Regex explanation:
        // \b(\w+)   : Captures a whole word in group 1
        // (?:\s+\1\b)+ : Matches one or more repetitions of the same word separated by whitespace
        String regex = "\\b(\\w+)(?:\\s+\\1\\b)+";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        while (numSentences-- > 0) {
            String input = in.nextLine();
            Matcher matcher = pattern.matcher(input);

            // Replace all consecutive duplicate matches with the first group instance
            while (matcher.find()) {
                input = input.replaceAll(matcher.group(), matcher.group(1));
            }

            System.out.println(input);
        }

        in.close();
    }
}
