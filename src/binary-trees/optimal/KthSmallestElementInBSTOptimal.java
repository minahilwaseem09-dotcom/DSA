// Time Complexity: O(k)
// Space Complexity: O(h) — stack
// Approach: Iterative inorder, stop exactly at kth element

import java.util.Stack;

public class KthSmallestElementInBSTOptimal {

    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }

    public static int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;

        while (curr != null || !stack.isEmpty()) {
            // left side tak jao
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }

            curr = stack.pop();
            k--; // ek element process hua

            if (k == 0) return curr.val; // kth element mila

            curr = curr.right; // right side jao
        }
        return -1;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(2);

        System.out.println(kthSmallest(root, 1)); // 1
        System.out.println(kthSmallest(root, 2)); // 2
    }
}