# Two Pointers

## Problem List

| # | Problem | Difficulty | LeetCode Link |
|---|---------|------------|---------------|
| 1 | Reverse String | Easy | https://leetcode.com/problems/reverse-string |
| 2 | Valid Palindrome | Easy | https://leetcode.com/problems/valid-palindrome |
| 3 | Container With Most Water | Medium | https://leetcode.com/problems/container-with-most-water |

## Approach

**Reverse String**
Brute force copies array into extra array in reverse order using O(n) space. Optimal uses two pointers from both ends swapping characters in-place until they meet — O(1) space.

**Valid Palindrome**
Brute force cleans the string by removing non-alphanumeric characters then compares with its reverse in O(n) space. Optimal uses two pointers from both ends skipping non-alphanumeric characters and comparing in O(1) space.

**Container With Most Water**
Brute force tries every pair of lines calculating water area in O(n²). Optimal uses two pointers starting from both ends — always move the pointer with shorter height inward since that is the limiting factor for water in O(n).

## Complexity Table

| Problem | Brute Time | Brute Space | Optimal Time | Optimal Space |
|---------|-----------|-------------|--------------|---------------|
| Reverse String | O(n) | O(n) | O(n) | O(1) |
| Valid Palindrome | O(n) | O(n) | O(n) | O(1) |
| Container With Most Water | O(n²) | O(1) | O(n) | O(1) |

## How to Run

```bash
javac ReverseStringBrute.java
java ReverseStringBrute

javac ReverseStringOptimal.java
java ReverseStringOptimal
```