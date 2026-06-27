// Time Complexity: O(n)
// Space Complexity: O(n) — output list
// Approach: Single pass with start pointer, close range when gap found

import java.util.*;

    public static List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        int i = 0;

        while (i < nums.length) {
            int start = nums[i]; // range ka start

            // jab tak consecutive hai aage jao
            while (i + 1 < nums.length && nums[i+1] == nums[i] + 1) {
                i++;
            }

            // range banao
            if (start == nums[i]) {
                result.add(String.valueOf(start)); // single number
            } else {
                result.add(start + "->" + nums[i]); // range
            }
            i++;
        }
        return result;
    }

    void main() {
        System.out.println(summaryRanges(new int[]{0,1,2,4,5,7})); // [0->2, 4->5, 7]
        System.out.println(summaryRanges(new int[]{0,2,3,4,6,8,9})); // [0, 2->4, 6, 8->9]
    }
