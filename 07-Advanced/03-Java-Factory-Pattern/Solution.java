import java.util.Scanner;

/**
 * Problem: Java Factory Pattern
 * Domain: Java / Advanced
 * Author: Jaydeep Sahu (github.com/sahujaydeep712-cpu)
 *
 * Description:
 * Implement the Factory Design Pattern.
 * FoodFactory returns instances of Food (Pizza or Cake) based on order string.
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */
interface Food {
    String getType();
}

class Pizza implements Food {
    public String getType() {
        return "Someone ordered a Fast Food!";
    }
}

class Cake implements Food {
    public String getType() {
        return "Someone ordered a Dessert!";
    }
}

class FoodFactory {
    public Food getFood(String order) {
        if (order == null) return null;
        if (order.equalsIgnoreCase("cake")) {
            return new Cake();
        } else if (order.equalsIgnoreCase("pizza")) {
            return new Pizza();
        }
        return null;
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FoodFactory foodFactory = new FoodFactory();
        Food food = foodFactory.getFood(sc.nextLine());

        System.out.println("The factory returned " + food.getClass());
        System.out.println(food.getType());
        sc.close();
    }
}
