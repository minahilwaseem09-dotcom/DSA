// Time Complexity: O(n)
// Space Complexity: O(n) — extra array
// Approach: Copy to new array in reverse order

public class ReverseStringBrute {

    public static void reverseString(char[] s) {
        char[] temp = new char[s.length];

        // reverse order mein copy karo
        for (int i = 0; i < s.length; i++) {
            temp[i] = s[s.length - 1 - i];
        }

        // wapas original mein copy karo
        for (int i = 0; i < s.length; i++) {
            s[i] = temp[i];
        }
    }

    static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
        System.out.println("Reverse for {'h','e','l','l','o'} : ");
        System.out.print(new String(s)); // olleh
    }
}