import java.util.BitSet;
import java.util.Scanner;

/**
 * Problem: Java BitSet
 * Domain: Java / Data Structures
 * Author: Jaydeep Sahu (github.com/sahujaydeep712-cpu)
 *
 * Description:
 * Given two BitSets B1 and B2 of size N, execute M operations:
 * AND, OR, XOR, FLIP, SET.
 * After each operation, print the number of set bits (cardinality) of B1 and B2.
 *
 * Time Complexity: O(M * (N / 64))
 * Space Complexity: O(N)
 */
public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);
        BitSet[] bitSets = new BitSet[] { null, b1, b2 };

        for (int i = 0; i < m; i++) {
            String operation = scanner.next();
            int op1 = scanner.nextInt();
            int op2 = scanner.nextInt();

            switch (operation) {
                case "AND":
                    bitSets[op1].and(bitSets[op2]);
                    break;
                case "OR":
                    bitSets[op1].or(bitSets[op2]);
                    break;
                case "XOR":
                    bitSets[op1].xor(bitSets[op2]);
                    break;
                case "FLIP":
                    bitSets[op1].flip(op2);
                    break;
                case "SET":
                    bitSets[op1].set(op2);
                    break;
            }

            System.out.println(b1.cardinality() + " " + b2.cardinality());
        }

        scanner.close();
    }
}
