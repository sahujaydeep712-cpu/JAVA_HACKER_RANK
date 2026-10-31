import java.util.Scanner;

/**
 * Problem: Java 1D Array (Part 2)
 * Domain: Java / Data Structures
 * Author: Jaydeep Sahu (github.com/sahujaydeep712-cpu)
 *
 * Description:
 * Determine if you can win the game starting at index 0.
 * In one move from index i:
 * - Move to i + 1 (if game[i + 1] == 0)
 * - Move to i - 1 (if i > 0 and game[i - 1] == 0)
 * - Jump to i + leap (if game[i + leap] == 0)
 * You win if you reach index >= game.length.
 *
 * Approach: Depth-First Search (DFS) with visited marking (setting cell to 1).
 * Time Complexity: O(n)
 * Space Complexity: O(n) recursion stack
 */
public class Solution {

    public static boolean canWin(int leap, int[] game) {
        return isSolvable(leap, game, 0);
    }

    private static boolean isSolvable(int leap, int[] game, int index) {
        // Base case: successfully reached beyond the array
        if (index >= game.length) {
            return true;
        }
        // Base case: out of bounds or invalid/visited cell
        if (index < 0 || game[index] == 1) {
            return false;
        }

        // Mark cell as visited to prevent infinite loops
        game[index] = 1;

        // Try leaping forward, stepping forward, or stepping backward
        return isSolvable(leap, game, index + leap)
            || isSolvable(leap, game, index + 1)
            || isSolvable(leap, game, index - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println((canWin(leap, game)) ? "YES" : "NO");
        }
        scan.close();
    }
}
