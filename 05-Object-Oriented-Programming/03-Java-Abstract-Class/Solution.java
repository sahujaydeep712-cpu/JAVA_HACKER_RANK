import java.util.Scanner;

/**
 * Problem: Java Abstract Class
 * Domain: Java / Object Oriented Programming
 * Author: Jaydeep Sahu (github.com/sahujaydeep712-cpu)
 *
 * Description:
 * Extend an abstract Book class and implement the abstract method
 * void setTitle(String s).
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */
abstract class Book {
    String title;

    abstract void setTitle(String s);

    String getTitle() {
        return title;
    }
}

class MyBook extends Book {
    @Override
    void setTitle(String s) {
        this.title = s;
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        MyBook newNovel = new MyBook();
        newNovel.setTitle(title);
        System.out.println("The title is: " + newNovel.getTitle());
        sc.close();
    }
}
