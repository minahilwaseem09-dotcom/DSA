// Time Complexity: O(n)
// Space Complexity: O(h)
// Approach: DFS with min/max bounds for each node

public class ValidateBinarySearchTreeOptimal {

    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }

    public static boolean validate(TreeNode root, Long min, Long max) {
        if (root == null) return true; // base case

        // bounds check
        if (root.val <= min || root.val >= max) return false;

        // left mein max = current, right mein min = current
        return validate(root.left, min, (long) root.val) &&
                validate(root.right, (long) root.val, max);
    }

    public static boolean isValidBST(TreeNode root) {
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(2);
        root1.left = new TreeNode(1);
        root1.right = new TreeNode(3);
        System.out.println(isValidBST(root1)); // true

        TreeNode root2 = new TreeNode(5);
        root2.left = new TreeNode(1);
        root2.right = new TreeNode(4);
        root2.right.left = new TreeNode(3);
        root2.right.right = new TreeNode(6);
        System.out.println(isValidBST(root2)); // false
    }
}