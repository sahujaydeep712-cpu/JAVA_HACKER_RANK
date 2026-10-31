/**
 * Problem: Java Method Overriding 2 (Super Keyword)
 * Domain: Java / Object Oriented Programming
 * Author: Jaydeep Sahu (github.com/sahujaydeep712-cpu)
 *
 * Description:
 * Call a superclass method from an overridden method using the super keyword.
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */
class BiCycle {
    String define_me() {
        return "a vehicle with pedals.";
    }
}

class MotorCycle extends BiCycle {
    @Override
    String define_me() {
        return "a cycle with an engine.";
    }

    MotorCycle() {
        System.out.println("Hello I am a motorcycle, I am " + define_me());
        String temp = super.define_me();
        System.out.println("My ancestor is a cycle who is " + temp);
    }
}

public class Solution {

    public static void main(String[] args) {
        MotorCycle M = new MotorCycle();
    }
}
