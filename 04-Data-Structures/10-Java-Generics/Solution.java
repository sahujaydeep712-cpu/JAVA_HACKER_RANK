import java.lang.reflect.Method;

/**
 * Problem: Java Generics
 * Domain: Java / Data Structures
 * Author: Jaydeep Sahu (github.com/sahujaydeep712-cpu)
 *
 * Description:
 * Print arrays of different types using a single generic method:
 * printArray(T[] array).
 *
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */
class Printer {
    public <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }
}

public class Solution {

    public static void main(String[] args) {
        Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = { "Hello", "World" };

        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);

        // Verify method overload count via reflection
        int count = 0;
        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();
            if (name.equals("printArray")) {
                count++;
            }
        }

        if (count > 1) {
            System.out.println("Method overloading is not allowed!");
        }
    }
}
