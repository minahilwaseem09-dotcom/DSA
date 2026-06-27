# Linked Lists

## Problem List

| # | Problem | Difficulty | LeetCode Link |
|---|---------|------------|---------------|
| 1 | Remove Duplicates from Sorted List | Easy | https://leetcode.com/problems/remove-duplicates-from-sorted-list |
| 2 | Linked List Cycle | Easy | https://leetcode.com/problems/linked-list-cycle |
| 3 | Merge Two Sorted Lists | Easy | https://leetcode.com/problems/merge-two-sorted-lists |

## Approach

**Remove Duplicates from Sorted List**
Brute force converts the list to an ArrayList, removes duplicates, and rebuilds the linked list using O(n) extra space. Optimal uses a single pointer traversing in-place — if current value equals next value, skip the next node by rewiring the pointer in O(1) space.

**Linked List Cycle**
Brute force stores every visited node in a HashSet — if a node is seen again, a cycle exists using O(n) space. Optimal uses Floyd's cycle detection algorithm with fast and slow pointers — fast moves 2 steps, slow moves 1 step — if they meet, a cycle exists in O(1) space.

**Merge Two Sorted Lists**
Brute force collects all values from both lists into an ArrayList, sorts them, and rebuilds in O(n log n). Optimal uses two pointers comparing heads of both lists — always attaching the smaller node to the result list in O(n) time and O(1) extra space.

## Complexity Table

| Problem | Brute Time | Brute Space | Optimal Time | Optimal Space |
|---------|-----------|-------------|--------------|---------------|
| Remove Duplicates from Sorted List | O(n) | O(n) | O(n) | O(1) |
| Linked List Cycle | O(n) | O(n) | O(n) | O(1) |
| Merge Two Sorted Lists | O(n log n) | O(n) | O(n) | O(1) |

## How to Run

```bash
javac RemoveDuplicatesFromSortedListBrute.java
java RemoveDuplicatesFromSortedListBrute

javac RemoveDuplicatesFromSortedListOptimal.java
java RemoveDuplicatesFromSortedListOptimal
```