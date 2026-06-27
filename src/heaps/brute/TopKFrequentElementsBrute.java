// Time Complexity: O(n log n)
// Space Complexity: O(n)
// Approach: Count frequency, sort by frequency descending, take top k

import java.util.*;

public class TopKFrequentElementsBrute {

    public static int[] topKFrequent(int[] nums, int k) {
        // frequency count
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // keys ko frequency se sort karo
        List<Integer> keys = new ArrayList<>(freq.keySet());
        keys.sort((a, b) -> freq.get(b) - freq.get(a)); // descending

        // top k lo
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = keys.get(i);
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