// Time Complexity: O(n*m) — n=words, m=prefix length
// Space Complexity: O(1)
// Approach: Take first string as prefix, shrink it by comparing with each word


    public static String longestCommonPrefix(String[] strs) {
        String prefix = strs[0]; // pehli string prefix hai

        for (int i = 1; i < strs.length; i++) {
            // jab tak current word prefix se start nahi hota
            while (!strs[i].startsWith(prefix)) {
                // prefix ek char chota karo
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }

    void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower","flow","flight"})); // fl
        System.out.println(longestCommonPrefix(new String[]{"dog","racecar","car"})); // ""
    }