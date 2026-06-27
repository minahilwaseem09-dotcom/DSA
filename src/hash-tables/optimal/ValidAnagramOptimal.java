// Time Complexity: O(n)
// Space Complexity: O(1) — fixed 26 size array
// Approach: Frequency array for 26 letters, increment for s, decrement for t

public class ValidAnagramOptimal {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] freq = new int[26]; // a-z

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++; // s ka letter add
            freq[t.charAt(i) - 'a']--; // t ka letter minus
        }

        // sab zero hone chahiye
        for (int count : freq) {
            if (count != 0) return false;
        }
        return true;
    }

    void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram")); // true
        System.out.println(isAnagram("rat", "car"));         // false
    }
}