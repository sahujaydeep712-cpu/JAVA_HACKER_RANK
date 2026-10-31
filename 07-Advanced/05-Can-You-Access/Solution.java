import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * Problem: Can You Access?
 * Domain: Java / Advanced
 * Author: Jaydeep Sahu (github.com/sahujaydeep712-cpu)
 *
 * Description:
 * Access a private inner class `Private` and its method `powerof2(int num)`
 * using Java Reflection, verifying whether num is a power of 2.
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();

        Object o;
        // Instantiate inner private class via reflection
        Inner inner = new Inner();
        Class<?> privateClass = Inner.class.getDeclaredClasses()[0];
        java.lang.reflect.Constructor<?> constructor = privateClass.getDeclaredConstructor(Inner.class);
        constructor.setAccessible(true);
        o = constructor.newInstance(inner);

        // Invoke powerof2 method
        Method method = privateClass.getDeclaredMethod("powerof2", int.class);
        method.setAccessible(true);
        String result = (String) method.invoke(o, num);

        System.out.println(num + " is " + result);
        System.out.println("An instance of class: " + o.getClass().getCanonicalName() + " has been created");
    }

    static class Inner {
        private class Private {
            private String powerof2(int num) {
                return ((num & num - 1) == 0) ? "power of 2" : "not a power of 2";
            }
        }
    }
}
