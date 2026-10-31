/**
 * Problem: Java Singleton Pattern
 * Domain: Java / Advanced
 * Author: Jaydeep Sahu (github.com/sahujaydeep712-cpu)
 *
 * Description:
 * Implement the Singleton pattern in Java:
 * - Private constructor prevents direct instantiation.
 * - Public String str property.
 * - Static getSingleInstance() returns the unique instance.
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */
class Singleton {
    private static Singleton instance;
    public String str;

    private Singleton() {
        // Prevent external construction
    }

    public static Singleton getSingleInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

public class Solution {

    public static void main(String[] args) {
        Singleton s1 = Singleton.getSingleInstance();
        s1.str = "Hello I am a singleton! Let me say hello world to you";
        System.out.println(s1.str);
    }
}
