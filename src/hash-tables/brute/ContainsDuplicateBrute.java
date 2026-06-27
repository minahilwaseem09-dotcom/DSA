// Time Complexity: O(n log n)
// Space Complexity: O(1)
// Approach: Sort array, check adjacent elements for duplicates

import java.util.Arrays;

    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums); // sort karo

        for (int i = 0; i < nums.length - 1; i++) {
            // adjacent same hain toh duplicate hai
            if (nums[i] == nums[i + 1]) return true;
        }
        return false;
    }

    void main(String[] args) {
        System.out.println("Results for Array {1,2,3,1} : "+containsDuplicate(new int[]{1,2,3,1})); // true
        System.out.println("Results for Array {1,2,3,4} : "+containsDuplicate(new int[]{1,2,3,4})); // false
    }
