public static boolean isSubsequence(String s, String t) {
    int pos = 0; // t mein current position

    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        boolean found = false;

        // t mein current pos se dhundo
        while (pos < t.length()) {
            if (t.charAt(pos) == c) {
                found = true;
                pos++;
                break;
            }
            pos++;
        }

        if (!found) return false; // character nahi mila
    }
    return true;
}

void main(String[] args) {
    System.out.println(isSubsequence("abc", "ahbgdc")); // true
    System.out.println(isSubsequence("axc", "ahbgdc")); // false
}