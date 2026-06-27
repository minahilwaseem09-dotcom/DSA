// Time Complexity: O(n)
// Space Complexity: O(n) — cleaned string
// Approach: Remove non-alphanumeric, compare with reverse

public class ValidPalindromeBrute {

    public static boolean isPalindrome(String s) {
        // sirf letters aur numbers rakho, lowercase karo
        StringBuilder clean = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                clean.append(Character.toLowerCase(c));
            }
        }

        // reverse se compare karo
        String original = clean.toString();
        String reversed = clean.reverse().toString();
        return original.equals(reversed);
    }

    static void main(String[] args) {
        System.out.println("Palindrome check for \"A man, a plan, a canal: Panama\" : "+isPalindrome("A man, a plan, a canal: Panama")); // true
        System.out.println("Palindrome check for \"race a car\" : "+isPalindrome("race a car")); // false
    }
}