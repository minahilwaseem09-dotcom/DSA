// Time Complexity: O(n)
// Space Complexity: O(h) — recursive call stack
// Approach: DFS recursive — 1 + max(left depth, right depth)

public class MaximumDepthOfBinaryTreeOptimal {

    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }

    public static int maxDepth(TreeNode root) {
        if (root == null) return 0; // base case

        int leftDepth = maxDepth(root.left);   // left side ki depth
        int rightDepth = maxDepth(root.right); // right side ki depth

        return 1 + Math.max(leftDepth, rightDepth); // current node + max side
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println(maxDepth(root)); // 3
    }
}