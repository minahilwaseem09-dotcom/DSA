# Arrays & Strings

## Problem List

| # | Problem | Difficulty | LeetCode Link |
|---|---------|------------|---------------|
| 1 | Find Closest Number to Zero | Easy | https://leetcode.com/problems/find-closest-number-to-zero |
| 2 | Is Subsequence | Easy | https://leetcode.com/problems/is-subsequence |
| 3 | Summary Ranges | Easy | https://leetcode.com/problems/summary-ranges |
| 4 | Longest Common Prefix | Easy | https://leetcode.com/problems/longest-common-prefix |
| 5 | Best Time to Buy and Sell Stock | Easy | https://leetcode.com/problems/best-time-to-buy-and-sell-stock |

## Approach

**Find Closest Number to Zero**
Brute force linearly scans the array tracking minimum absolute value. Optimal does the same single pass but handles the tie-breaking rule explicitly — if two numbers are equally close to zero, the positive one wins using Math.max().

**Is Subsequence**
Brute force uses nested loops to search each character of s inside t from current position in O(n×m). Optimal uses two pointers — one for s and one for t — advancing the s pointer only on a match, giving O(n+m).

**Summary Ranges**
Brute force checks every pair to find range boundaries in O(n²). Optimal uses a single pass with a start pointer — when a gap is found, the current range is closed and a new one begins in O(n).

**Longest Common Prefix**
Brute force takes the first string as prefix and keeps shrinking it by comparing with each word in O(n×m). Optimal sorts the array lexicographically and only compares the first and last strings — these are the most different, so their common prefix is the answer for all in O(n log n).

**Best Time to Buy and Sell Stock**
Brute force tries every buy-sell pair in O(n²). Optimal does a single pass tracking the running minimum price — at each step it calculates profit as current price minus minimum seen so far in O(n).

## Complexity Table

| Problem | Brute Time | Brute Space | Optimal Time | Optimal Space |
|---------|-----------|-------------|--------------|---------------|
| Find Closest Number to Zero | O(n) | O(1) | O(n) | O(1) |
| Is Subsequence | O(n×m) | O(1) | O(n+m) | O(1) |
| Summary Ranges | O(n²) | O(n) | O(n) | O(n) |
| Longest Common Prefix | O(n×m) | O(1) | O(n log n) | O(1) |
| Best Time to Buy and Sell Stock | O(n²) | O(1) | O(n) | O(1) |

## How to Run

```bash
# Compile karo
javac FindClosestNumberToZeroBrute.java
java FindClosestNumberToZeroBrute

# Ya optimal
javac FindClosestNumberToZeroOptimal.java
java FindClosestNumberToZeroOptimal
```