// Time Complexity: O(n)
// Space Complexity: O(n)
// Approach: HashMap stores complement (target - num) with index

import java.util.HashMap;

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>(); // value → index

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; // mujhe yeh chahiye

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i); // store karo
        }
        return new int[]{};
    }

    void main(String[] args) {
        int[] result = twoSum(new int[]{2,7,11,15}, 9);
        System.out.println(result[0] + ", " + result[1]); // 0, 1
    }
