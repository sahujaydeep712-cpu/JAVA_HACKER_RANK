import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Problem: Java Varargs - Simple Addition
 * Domain: Java / Advanced
 * Author: Jaydeep Sahu (github.com/sahujaydeep712-cpu)
 *
 * Description:
 * Create a class Add with an overloaded/varargs method add(int... numbers)
 * that prints the addition equation (e.g., "1+2=3") and computes the sum.
 *
 * Time Complexity: O(k) per addition call
 * Space Complexity: O(1)
 */
class Add {
    public void add(int... numbers) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sb.append(numbers[i]);
            sum += numbers[i];
            if (i < numbers.length - 1) {
                sb.append("+");
            }
        }
        sb.append("=").append(sum);
        System.out.println(sb.toString());
    }
}

public class Solution {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int n1 = scanner.nextInt();
            int n2 = scanner.nextInt();
            int n3 = scanner.nextInt();
            int n4 = scanner.nextInt();
            int n5 = scanner.nextInt();
            int n6 = scanner.nextInt();
            scanner.close();

            Add ob = new Add();
            ob.add(n1, n2);
            ob.add(n1, n2, n3);
            ob.add(n1, n2, n3, n4, n5);
            ob.add(n1, n2, n3, n4, n5, n6);

            Method[] methods = Add.class.getDeclaredMethods();
            Set<String> set = new HashSet<>();
            boolean overload = false;
            for (int i = 0; i < methods.length; i++) {
                if (set.contains(methods[i].getName())) {
                    overload = true;
                    break;
                }
                set.add(methods[i].getName());
            }
            if (overload) {
                throw new Exception("Overloading not allowed");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
