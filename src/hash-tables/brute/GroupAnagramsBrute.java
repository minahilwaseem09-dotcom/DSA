// Time Complexity: O(n^2 * k) — k = average string length
// Space Complexity: O(n)
// Approach: Compare every pair of strings by sorting

import java.util.*;

public class GroupAnagramsBrute {

    public static List<List<String>> groupAnagrams(String[] strs) {
        boolean[] visited = new boolean[strs.length];
        List<List<String>> result = new ArrayList<>();

        for (int i = 0; i < strs.length; i++) {
            if (visited[i]) continue;

            List<String> group = new ArrayList<>();
            group.add(strs[i]);
            char[] sorted1 = strs[i].toCharArray();
            Arrays.sort(sorted1);

            for (int j = i + 1; j < strs.length; j++) {
                if (visited[j]) continue;
                char[] sorted2 = strs[j].toCharArray();
                Arrays.sort(sorted2);

                if (Arrays.equals(sorted1, sorted2)) {
                    group.add(strs[j]);
                    visited[j] = true;
                }
            }
            result.add(group);
        }
        return result;
    }

    static void main(String[] args) {
        String[] input = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(input));
    }
}