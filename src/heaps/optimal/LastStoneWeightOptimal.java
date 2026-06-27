// Time Complexity: O(n log n)
// Space Complexity: O(n)
// Approach: Max heap — always smash two heaviest in O(log n)

import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeightOptimal {

    public static int lastStoneWeight(int[] stones) {
        // Max heap banao
        PriorityQueue<Integer> maxHeap =
                new PriorityQueue<>(Collections.reverseOrder());

        // saari stones heap mein daalo
        for (int stone : stones) maxHeap.offer(stone);

        while (maxHeap.size() > 1) {
            int y = maxHeap.poll(); // sabse bhari
            int x = maxHeap.poll(); // doosri bhari

            if (x != y) {
                maxHeap.offer(y - x); // difference wapas
            }
        }

        return maxHeap.isEmpty() ? 0 : maxHeap.peek();
    }

    static void main(String[] args) {
        System.out.println(lastStoneWeight(new int[]{2,7,4,1,8,1})); // 1
        System.out.println(lastStoneWeight(new int[]{1}));            // 1
    }
}