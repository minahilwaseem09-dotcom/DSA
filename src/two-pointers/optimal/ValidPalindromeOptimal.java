// Time Complexity: O(n)
// Space Complexity: O(1) — no extra string
// Approach: Two pointers from ends, skip non-alphanumeric characters

public class ValidPalindromeOptimal {

    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            // left pointer pe non-alphanumeric skip karo
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            // right pointer pe non-alphanumeric skip karo
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            // compare karo
            if (Character.toLowerCase(s.charAt(left)) !=
                    Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    static void main(String[] args) {
        System.out.println("Palindrome check for \"A man, a plan, a canal: Panama\" : "+isPalindrome("A man, a plan, a canal: Panama")); // true
        System.out.println("Palindrome check for \"race a car\" : "+isPalindrome("race a car")); // false
    }
}