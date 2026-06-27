// Time Complexity: O(n^2)
// Space Complexity: O(n)
// Approach: Check every pair to find range boundaries

import java.util.*;


    public static List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        int n = nums.length;
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (visited[i]) continue;
            int start = i;

            // consecutive numbers dhundo
            for (int j = i + 1; j < n; j++) {
                if (nums[j] == nums[j-1] + 1) {
                    visited[j] = true;
                    i = j;
                } else {
                    break;
                }
            }

            // range string banao
            if (start == i) {
                result.add(String.valueOf(nums[start]));
            } else {
                result.add(nums[start] + "->" + nums[i]);
            }
        }
        return result;
    }

    void main(String[] args) {
        System.out.println(summaryRanges(new int[]{0,1,2,4,5,7})); // [0->2, 4->5, 7]
        System.out.println(summaryRanges(new int[]{0,2,3,4,6,8,9})); // [0, 2->4, 6, 8->9]
    }
