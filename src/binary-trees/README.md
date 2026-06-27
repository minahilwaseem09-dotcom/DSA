# Binary Trees

## Problem List

| # | Problem | Difficulty | LeetCode Link |
|---|---------|------------|---------------|
| 1 | Invert Binary Tree | Easy | https://leetcode.com/problems/invert-binary-tree |
| 2 | Maximum Depth of Binary Tree | Easy | https://leetcode.com/problems/maximum-depth-of-binary-tree |
| 3 | Kth Smallest Element in a BST | Medium | https://leetcode.com/problems/kth-smallest-element-in-a-bst |
| 4 | Diameter of Binary Tree | Easy | https://leetcode.com/problems/diameter-of-binary-tree |
| 5 | Validate Binary Search Tree | Medium | https://leetcode.com/problems/validate-binary-search-tree |
| 6 | Implement Trie (Prefix Tree) | Medium | https://leetcode.com/problems/implement-trie-prefix-tree |
| 7 | Minimum Absolute Difference in BST | Easy | https://leetcode.com/problems/minimum-absolute-difference-in-bst |

## Approach

**Invert Binary Tree**
Brute force uses BFS with a queue to swap left and right children level by level. Optimal uses recursive DFS — swap the children first then recursively invert both subtrees in O(n) with O(h) stack space.

**Maximum Depth of Binary Tree**
Brute force uses BFS level order traversal counting levels with a queue. Optimal uses recursive DFS returning 1 + max(leftDepth, rightDepth) — elegant and uses only O(h) stack space.

**Kth Smallest Element in BST**
Brute force collects all nodes via inorder traversal into a list and returns index k-1 in O(n) space. Optimal uses iterative inorder with a stack — stops exactly at the kth element in O(k) time and O(h) space.

**Diameter of Binary Tree**
Brute force calculates left height + right height for every node separately causing O(n²) time. Optimal uses a single DFS pass updating a global maximum diameter at each node while returning height — O(n) time.

**Validate Binary Search Tree**
Brute force collects inorder traversal into a list and checks if it is strictly increasing in O(n) space. Optimal uses DFS with min/max bounds passed down — each node must lie strictly between its bounds in O(h) space.

**Implement Trie**
Brute force stores all words in an ArrayList and uses built-in startsWith for prefix checks. Optimal uses TrieNode with a children array of size 26 — each insert/search/startsWith runs in O(L) where L is word length.

**Minimum Absolute Difference in BST**
Brute force collects inorder into a list and compares all pairs in O(n²). Optimal uses inorder traversal with a prev pointer — since inorder of BST is sorted, minimum difference is always between adjacent nodes in O(n).

## Complexity Table

| Problem | Brute Time | Brute Space | Optimal Time | Optimal Space |
|---------|-----------|-------------|--------------|---------------|
| Invert Binary Tree | O(n) | O(n) | O(n) | O(h) |
| Maximum Depth of Binary Tree | O(n) | O(n) | O(n) | O(h) |
| Kth Smallest Element in BST | O(n) | O(n) | O(k) | O(h) |
| Diameter of Binary Tree | O(n²) | O(h) | O(n) | O(h) |
| Validate Binary Search Tree | O(n) | O(n) | O(n) | O(h) |
| Implement Trie | O(n) | O(n) | O(L) | O(n×L) |
| Minimum Absolute Difference in BST | O(n²) | O(n) | O(n) | O(h) |

## How to Run

```bash
javac InvertBinaryTreeBrute.java
java InvertBinaryTreeBrute

javac InvertBinaryTreeOptimal.java
java InvertBinaryTreeOptimal
```