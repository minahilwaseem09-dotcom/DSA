// Time Complexity: O(n)
// Space Complexity: O(1) — in-place
// Approach: Two pointers from both ends, swap until they meet

public class ReverseStringOptimal {

    public static void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            // swap karo
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }

    static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
        System.out.println("Reverse for {'h','e','l','l','o'} : ");
        System.out.println(new String(s)); // olleh
    }
}