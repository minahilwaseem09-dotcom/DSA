// Time Complexity: O(n^2)
// Space Complexity: O(1)
// Approach: Try every pair of lines, calculate water, track maximum

public class ContainerWithMostWaterBrute {

    public static int maxArea(int[] height) {
        int maxWater = 0;

        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                // pani = choti height × distance
                int water = Math.min(height[i], height[j]) * (j - i);
                maxWater = Math.max(maxWater, water);
            }
        }
        return maxWater;
    }

    static void main(String[] args) {
        System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7})); // 49
        System.out.println(maxArea(new int[]{1,1})); // 1
    }
}