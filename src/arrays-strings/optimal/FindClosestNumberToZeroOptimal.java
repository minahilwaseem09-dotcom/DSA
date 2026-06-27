
// Time Complexity: O(n)
// Space Complexity: O(1)
// Approach: Single pass, track closest with explicit tie-breaking (positive wins)

    public static int findClosestNumber(int[] nums) {
        int closest = nums[0];

        for (int num : nums) {
            // closer to zero found
            if (Math.abs(num) < Math.abs(closest)) {
                closest = num;
            }
            // same distance — positive wins
            else if (Math.abs(num) == Math.abs(closest)) {
                closest = Math.max(closest, num);
            }
        }
        return closest;
    }

    void main(String[] args) {
        int[] test1 = {-4, -2, 1, 4, 8};
        int[] test2 = {2, -1, 1};

        System.out.println(findClosestNumber(test1)); // 1
        System.out.println(findClosestNumber(test2)); // 1
    }
