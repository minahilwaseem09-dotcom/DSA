// Time Complexity: O(n)
// Space Complexity: O(n)
// Approach: HashSet — if element already exists, duplicate found

import java.util.HashSet;

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();

        for (int num : nums) {
            if (seen.contains(num)) return true; // already dekha
            seen.add(num);
        }
        return false;
    }

    void main(String[] args) {

        System.out.println("Results for Array {1,2,3,1} : "+containsDuplicate(new int[]{1,2,3,1})); // true
        System.out.println("Results for Array {1,2,3,4} : "+containsDuplicate(new int[]{1,2,3,4})); // false
    }
