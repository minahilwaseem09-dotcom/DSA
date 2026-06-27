
// Time Complexity: O(n)
// Space Complexity: O(1)
// Approach: Linear scan, track minimum absolute value, handle tie by picking positive

    public static int findClosestNumber(int[] nums) {
        int closest = nums[0]; // pehla element assume karo closest

        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];

            // agar current zero ke zyada paas hai
            if (Math.abs(curr) < Math.abs(closest)) {
                closest = curr;
            }
            // agar bilkul same distance par hai toh positive prefer karo
            else if (Math.abs(curr) == Math.abs(closest) && curr > closest) {
                closest = curr;
            }
        }
        return closest;
    }

    void main(String[] args) {
        int[] test1 = {-4, -2, 1, 4, 8};
        int[] test2 = {2, -1, 1};

        System.out.println();
        System.out.println(findClosestNumber(test1)); // 1
        System.out.println(findClosestNumber(test2)); // 1 (tie: +1 wins over -1)
    }

