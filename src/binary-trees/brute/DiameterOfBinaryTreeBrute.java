// Time Complexity: O(n^2)
// Space Complexity: O(h)
// Approach: For each node calculate left height + right height

public class DiameterOfBinaryTreeBrute {

    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }

    public static int height(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public static int diameterOfBinaryTree(TreeNode root) {
        if (root == null) return 0;

        // is node se guzarne wala diameter
        int leftH = height(root.left);
        int rightH = height(root.right);
        int currDiameter = leftH + rightH;

        // left aur right subtree ka bhi check karo
        int leftDiameter = diameterOfBinaryTree(root.left);
        int rightDiameter = diameterOfBinaryTree(root.right);

        return Math.max(currDiameter, Math.max(leftDiameter, rightDiameter));
    }

    static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println(diameterOfBinaryTree(root)); // 3
    }
}