# Heaps

## Problem List

| # | Problem | Difficulty | LeetCode Link |
|---|---------|------------|---------------|
| 1 | Last Stone Weight | Easy | https://leetcode.com/problems/last-stone-weight |
| 2 | Kth Largest Element in Array | Medium | https://leetcode.com/problems/kth-largest-element-in-an-array |
| 3 | Top K Frequent Elements | Medium | https://leetcode.com/problems/top-k-frequent-elements |

## Approach

**Last Stone Weight**
Brute force sorts the list on every iteration and removes the two heaviest stones in O(n² log n). Optimal uses a max heap — the two heaviest stones are always at the top, so each smash operation is O(log n), giving O(n log n) total.

**Kth Largest Element in Array**
Brute force sorts the array and returns the element at index n-k in O(n log n). Optimal maintains a min heap of size k — when heap exceeds size k the smallest is removed, so the root is always the kth largest in O(n log k).

**Top K Frequent Elements**
Brute force counts frequencies with a HashMap then sorts keys by frequency in O(n log n). Optimal uses a min heap of size k ordered by frequency — less frequent elements are removed keeping only top k frequent elements in O(n log k).

## Complexity Table

| Problem | Brute Time | Brute Space | Optimal Time | Optimal Space |
|---------|-----------|-------------|--------------|---------------|
| Last Stone Weight | O(n² log n) | O(n) | O(n log n) | O(n) |
| Kth Largest Element | O(n log n) | O(1) | O(n log k) | O(k) |
| Top K Frequent Elements | O(n log n) | O(n) | O(n log k) | O(n) |

## How to Run

```bash
javac LastStoneWeightBrute.java
java LastStoneWeightBrute

javac LastStoneWeightOptimal.java
java LastStoneWeightOptimal
```