import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Problem: Java Iterator
 * Domain: Java / Object Oriented Programming
 * Author: Jaydeep Sahu (github.com/sahujaydeep712-cpu)
 *
 * Description:
 * Use a Java Iterator to advance past a special delimiter string "###"
 * and iterate through the remaining elements in the collection.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
public class Solution {

    static Iterator func(ArrayList mylist) {
        Iterator it = mylist.iterator();
        while (it.hasNext()) {
            Object element = it.next();
            // Advance iterator until we find the marker "###"
            if (element instanceof String && element.equals("###")) {
                break;
            }
        }
        return it;
    }

    public static void main(String[] args) {
        ArrayList mylist = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 0; i < n; i++) {
            mylist.add(sc.nextInt());
        }

        mylist.add("###");
        for (int i = 0; i < m; i++) {
            mylist.add(sc.next());
        }

        Iterator it = func(mylist);
        while (it.hasNext()) {
            Object element = it.next();
            System.out.println((String) element);
        }
        sc.close();
    }
}
