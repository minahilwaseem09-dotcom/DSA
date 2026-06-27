// Time Complexity: O(n log n)
// Space Complexity: O(1)
// Approach: Sort descending, return element at index k-1

import java.util.Arrays;

public class KthLargestElementInArrayBrute {

    public static int findKthLargest(int[] nums, int k) {
        // descending sort
        Arrays.sort(nums);

        // last se kth element
        return nums[nums.length - k];
    }

    static void main(String[] args) {
        System.out.println(findKthLargest(new int[]{3,2,1,5,6,4}, 2)); // 5
        System.out.println(findKthLargest(new int[]{3,2,3,1,2,4,5,5,6}, 4)); // 4
    }
}