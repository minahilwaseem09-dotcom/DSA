// Time Complexity: O(n)
// Space Complexity: O(1)
// Approach: Count each required letter manually

    public static int maxNumberOfBalloons(String text) {
        int b = 0, a = 0, l = 0, o = 0, n = 0;

        for (char c : text.toCharArray()) {
            if (c == 'b') b++;
            else if (c == 'a') a++;
            else if (c == 'l') l++;
            else if (c == 'o') o++;
            else if (c == 'n') n++;
        }

        // l aur o ka 2 chahiye isliye divide by 2
        return Math.min(Math.min(Math.min(b, a), Math.min(l/2, o/2)), n);
    }

    void main(String[] args) {
        System.out.println("For nlaebolko : "+maxNumberOfBalloons("nlaebolko"));    // 1
        System.out.println("For loonbalxballoon : "+maxNumberOfBalloons("loonbalxballoon")); // 2
    }
