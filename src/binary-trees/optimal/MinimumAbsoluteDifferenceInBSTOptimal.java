// Time Complexity: O(n)
// Space Complexity: O(h)
// Approach: Inorder traversal with prev pointer, compare adjacent nodes

public class MinimumAbsoluteDifferenceInBSTOptimal {

    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }

    static int minDiff = Integer.MAX_VALUE;
    static TreeNode prev = null;

    public static void inorder(TreeNode root) {
        if (root == null) return;

        inorder(root.left);

        // prev node se compare karo
        if (prev != null) {
            minDiff = Math.min(minDiff, root.val - prev.val);
        }
        prev = root; // current ko prev banao

        inorder(root.right);
    }

    public static int getMinimumDifference(TreeNode root) {
        minDiff = Integer.MAX_VALUE;
        prev = null;
        inorder(root);
        return minDiff;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        System.out.println(getMinimumDifference(root)); // 1
    }
}