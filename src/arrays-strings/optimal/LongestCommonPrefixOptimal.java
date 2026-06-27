// Time Complexity: O(n log n) — sorting
// Space Complexity: O(1)
// Approach: Sort array, compare only first and last string

import java.util.Arrays;

    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs); // lexicographic sort

        String first = strs[0];
        String last = strs[strs.length - 1];
        int i = 0;

        // pehle aur aakhri word ka common prefix = sabka common prefix
        while (i < first.length() && i < last.length()
                && first.charAt(i) == last.charAt(i)) {
            i++;
        }

        return first.substring(0, i);
    }

    void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower","flow","flight"})); // fl
        System.out.println(longestCommonPrefix(new String[]{"dog","racecar","car"})); // ""
    }