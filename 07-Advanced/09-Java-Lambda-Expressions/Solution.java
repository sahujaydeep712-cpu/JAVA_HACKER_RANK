import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

/**
 * Problem: Java Lambda Expressions
 * Domain: Java / Advanced
 * Author: Jaydeep Sahu (github.com/sahujaydeep712-cpu)
 *
 * Description:
 * Implement functional interfaces using Java 8 lambda expressions:
 * 1. isOdd(): Returns true if number is odd.
 * 2. isPrime(): Returns true if number is prime.
 * 3. isPalindrome(): Returns true if number is palindrome.
 *
 * Time Complexity: O(T * sqrt(N))
 * Space Complexity: O(1)
 */
interface PerformOperation {
    boolean check(int a);
}

class MyMath {
    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }

    public PerformOperation isOdd() {
        return (int a) -> a % 2 != 0;
    }

    public PerformOperation isPrime() {
        return (int a) -> BigInteger.valueOf(a).isProbablePrime(10);
    }

    public PerformOperation isPalindrome() {
        return (int a) -> {
            String s = Integer.toString(a);
            return s.equals(new StringBuilder(s).reverse().toString());
        };
    }
}

public class Solution {

    public static void main(String[] args) throws IOException {
        MyMath ob = new MyMath();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int totalQueries = Integer.parseInt(br.readLine());

        PerformOperation op;
        boolean ret = false;
        String ans = null;

        while (totalQueries-- > 0) {
            String s = br.readLine().trim();
            StringTokenizer st = new StringTokenizer(s);
            int ch = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());

            if (ch == 1) {
                op = ob.isOdd();
                ret = ob.checker(op, num);
                ans = ret ? "ODD" : "EVEN";
            } else if (ch == 2) {
                op = ob.isPrime();
                ret = ob.checker(op, num);
                ans = ret ? "PRIME" : "COMPOSITE";
            } else if (ch == 3) {
                op = ob.isPalindrome();
                ret = ob.checker(op, num);
                ans = ret ? "PALINDROME" : "NOT PALINDROME";
            }
            System.out.println(ans);
        }
    }
}
