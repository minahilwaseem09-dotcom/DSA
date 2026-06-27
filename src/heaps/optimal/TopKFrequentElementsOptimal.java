// Time Complexity: O(n log k)
// Space Complexity: O(n)
// Approach: HashMap frequency + min heap of size k by frequency

import java.util.*;

public class TopKFrequentElementsOptimal {

    public static int[] topKFrequent(int[] nums, int k) {
        // Step 1: frequency count
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Step 2: min heap by frequency
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(
                (a, b) -> freq.get(a) - freq.get(b) // choti frequency upar
        );

        for (int num : freq.keySet()) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll(); // kam frequent nikalo
            }
        }

        // Step 3: result
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = minHeap.poll();
        }
        return result;
    }

    static void main(String[] args) {
        System.out.println(Arrays.toString(
                topKFrequent(new int[]{1,1,1,2,2,3}, 2))); // [1, 2]
        System.out.println(Arrays.toString(
                topKFrequent(new int[]{1}, 1)));             // [1]
    }
}