import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Problem: Java Comparator
 * Domain: Java / Data Structures
 * Author: Jaydeep Sahu (github.com/sahujaydeep712-cpu)
 *
 * Description:
 * Implement a Comparator to sort Player objects:
 * 1. In decreasing order of score.
 * 2. If two players have the same score, sort them alphabetically by name.
 *
 * Time Complexity: O(n log n)
 * Space Complexity: O(1) auxiliary
 */
class Checker implements Comparator<Player> {
    @Override
    public int compare(Player a, Player b) {
        if (a.score != b.score) {
            // Decreasing order of score
            return Integer.compare(b.score, a.score);
        }
        // Alphabetical order of name
        return a.name.compareTo(b.name);
    }
}

class Player {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();

        for (int i = 0; i < n; i++) {
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for (int i = 0; i < player.length; i++) {
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}
