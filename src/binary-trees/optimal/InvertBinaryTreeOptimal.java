// Time Complexity: O(n)
// Space Complexity: O(h) — h = height, recursive call stack
// Approach: Recursive DFS — swap children then recurse

public class InvertBinaryTreeOptimal {

    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }

    public static TreeNode invertTree(TreeNode root) {
        if (root == null) return null; // base case

        // pehle swap karo
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        // phir recursively dono sides invert karo
        invertTree(root.left);
        invertTree(root.right);

        return root;
    }

    static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        invertTree(root);
        System.out.println(root.val);       // 4
        System.out.println(root.left.val);  // 7
        System.out.println(root.right.val); // 2
    }
}