/**
 * Problem: Java Inheritance II
 * Domain: Java / Object Oriented Programming
 * Author: Jaydeep Sahu (github.com/sahujaydeep712-cpu)
 *
 * Description:
 * Create an Arithmetic class containing an add method that takes 2 integers.
 * Create an Adder class that inherits from Arithmetic.
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */
class Arithmetic {
    public int add(int a, int b) {
        return a + b;
    }
}

class Adder extends Arithmetic {
    // Inherits add(int a, int b) from Arithmetic
}

public class Solution {

    public static void main(String[] args) {
        Adder a = new Adder();

        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());
        System.out.print(a.add(10, 32) + " " + a.add(10, 3) + " " + a.add(10, 10) + "\n");
    }
}
