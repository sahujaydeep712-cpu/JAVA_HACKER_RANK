import java.util.Scanner;

/**
 * Problem: Java Interface
 * Domain: Java / Object Oriented Programming
 * Author: Jaydeep Sahu (github.com/sahujaydeep712-cpu)
 *
 * Description:
 * Implement interface AdvancedArithmetic in class MyCalculator.
 * Calculate the sum of all divisors of an integer n: divisor_sum(int n).
 *
 * Time Complexity: O(sqrt(n)) or O(n)
 * Space Complexity: O(1)
 */
interface AdvancedArithmetic {
    int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic {
    @Override
    public int divisor_sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}

public class Solution {

    public static void main(String[] args) {
        MyCalculator myCalculator = new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(myCalculator);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(myCalculator.divisor_sum(n) + "\n");
        sc.close();
    }

    static void ImplementedInterfaceNames(Object o) {
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (Class theInterface : theInterfaces) {
            String interfaceName = theInterface.getName();
            System.out.println(interfaceName);
        }
    }
}
