// Time Complexity: O(n+m)
// Space Complexity: O(1)
// Approach: Two pointers — i for s, j for t, advance independently

    public static boolean isSubsequence(String s, String t) {
        int i = 0; // pointer for s
        int j = 0; // pointer for t

        while (i < s.length() && j < t.length()) {
            // match mila toh s ka pointer aage
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            // t ka pointer hamesha aage badhta hai
            j++;
        }

        // agar s ke saare chars match hue
        return i == s.length();
    }

    void main(String[] args) {
        System.out.println(isSubsequence("abc", "ahbgdc")); // true
        System.out.println(isSubsequence("axc", "ahbgdc")); // false
    }