// Time Complexity: O(n^2)
// Space Complexity: O(n)
// Approach: Collect inorder, compare all pairs

import java.util.ArrayList;
import java.util.List;

public class MinimumAbsoluteDifferenceInBSTBrute {

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

    public static int getMinimumDifference(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorder(root, list);

        int minDiff = Integer.MAX_VALUE;

        // har pair compare karo
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                minDiff = Math.min(minDiff, Math.abs(list.get(i) - list.get(j)));
            }
        }
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