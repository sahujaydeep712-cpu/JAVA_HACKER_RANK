import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Problem: Java Dequeue
 * Domain: Java / Data Structures
 * Author: Jaydeep Sahu (github.com/sahujaydeep712-cpu)
 *
 * Description:
 * In this problem, you are given N integers. You need to find the maximum
 * number of unique integers among all possible contiguous subarrays of size M.
 *
 * Approach: Sliding window of size M with a Deque and HashMap for frequency tracking.
 * Time Complexity: O(N)
 * Space Complexity: O(M)
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        Deque<Integer> deque = new ArrayDeque<>();
        Map<Integer, Integer> freqMap = new HashMap<>();
        int maxUnique = 0;

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();

            // Add element to window
            deque.addLast(num);
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);

            // Once window reaches size M
            if (deque.size() == m) {
                maxUnique = Math.max(maxUnique, freqMap.size());

                // If window already contains all unique elements, that is upper bound M
                if (maxUnique == m) {
                    break;
                }

                // Remove oldest element to slide window forward
                int removed = deque.removeFirst();
                int currentCount = freqMap.get(removed);
                if (currentCount == 1) {
                    freqMap.remove(removed);
                } else {
                    freqMap.put(removed, currentCount - 1);
                }
            }
        }
        in.close();

        System.out.println(maxUnique);
    }
}
