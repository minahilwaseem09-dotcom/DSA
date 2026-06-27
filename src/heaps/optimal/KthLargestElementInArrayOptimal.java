// Time Complexity: O(n log k)
// Space Complexity: O(k)
// Approach: Min heap of size k — root is always kth largest

import java.util.PriorityQueue;

public class KthLargestElementInArrayOptimal {

    public static int findKthLargest(int[] nums, int k) {
        // Min heap — size k
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums) {
            minHeap.offer(num); // daalo

            if (minHeap.size() > k) {
                minHeap.poll(); // sabse chota nikalo
            }
        }

        // root = kth largest
        return minHeap.peek();
    }

    static void main(String[] args) {
        System.out.println(findKthLargest(new int[]{3,2,1,5,6,4}, 2)); // 5
        System.out.println(findKthLargest(new int[]{3,2,3,1,2,4,5,5,6}, 4)); // 4
    }
}