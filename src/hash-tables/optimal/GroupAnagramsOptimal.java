// Time Complexity: O(n * k log k) — k = string length
// Space Complexity: O(n)
// Approach: Sort each word as HashMap key, group by key

import java.util.*;

public class GroupAnagramsOptimal {

    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            // word sort karo — yeh key hai
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars); // "eat" → "aet"

            // key exist nahi toh nai list banao
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(word);
        }

        return new ArrayList<>(map.values());
    }

    static void main(String[] args) {
        String[] input = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(input));
    }
}