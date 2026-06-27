// Time Complexity: O(n)
// Space Complexity: O(1)
// Approach: HashMap frequency count, floor division for l and o

import java.util.HashMap;

public class MaximumNumberOfBalloonsOptimal {

    public static int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> freq = new HashMap<>();

        for (char c : text.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        // balloon = b,a,l,l,o,o,n
        int b = freq.getOrDefault('b', 0);
        int a = freq.getOrDefault('a', 0);
        int l = freq.getOrDefault('l', 0) / 2; // 2 chahiye
        int o = freq.getOrDefault('o', 0) / 2; // 2 chahiye
        int n = freq.getOrDefault('n', 0);

        return Math.min(Math.min(Math.min(b, a), Math.min(l, o)), n);
    }

    void main(String[] args) {
        System.out.println("For nlaebolko : "+maxNumberOfBalloons("nlaebolko"));    // 1
        System.out.println("For loonbalxballoon : "+maxNumberOfBalloons("loonbalxballoon")); // 2
    }
}