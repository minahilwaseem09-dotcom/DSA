// Time Complexity: O(n)
// Space Complexity: O(h)
// Approach: Single DFS, update global diameter at each node

public class DiameterOfBinaryTreeOptimal {

    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }

    static int maxDiameter = 0; // global max

    public static int dfs(TreeNode root) {
        if (root == null) return 0;

        int left = dfs(root.left);   // left height
        int right = dfs(root.right); // right height

        // is node pe diameter update karo
        maxDiameter = Math.max(maxDiameter, left + right);

        return 1 + Math.max(left, right); // height return karo
    }

    public static int diameterOfBinaryTree(TreeNode root) {
        maxDiameter = 0;
        dfs(root);
        return maxDiameter;
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