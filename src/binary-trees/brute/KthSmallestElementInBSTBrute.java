// Time Complexity: O(n)
// Space Complexity: O(n) — list
// Approach: Inorder traversal collect all, return index k-1

import java.util.ArrayList;
import java.util.List;

public class KthSmallestElementInBSTBrute {

    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }

    public static void inorder(TreeNode root, List<Integer> list) {
        if (root == null) return;
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }

    public static int kthSmallest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        inorder(root, list);
        return list.get(k - 1); // k-1 because 0-indexed
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