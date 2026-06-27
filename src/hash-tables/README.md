# Hash Tables

## Problem List

| # | Problem | Difficulty | LeetCode Link |
|---|---------|------------|---------------|
| 1 | Contains Duplicate | Easy | https://leetcode.com/problems/contains-duplicate |
| 2 | Two Sum | Easy | https://leetcode.com/problems/two-sum |
| 3 | Maximum Number of Balloons | Easy | https://leetcode.com/problems/maximum-number-of-balloons |
| 4 | Valid Anagram | Easy | https://leetcode.com/problems/valid-anagram |
| 5 | Group Anagrams | Medium | https://leetcode.com/problems/group-anagrams |

## Approach

**Contains Duplicate**
Brute force sorts the array and checks adjacent elements in O(n log n). Optimal uses a HashSet to track seen elements — if a number already exists in the set, we return true immediately in O(n).

**Two Sum**
Brute force checks every pair of numbers in O(n²). Optimal uses a HashMap to store each number's complement (target - num) as we iterate — if the complement already exists in the map, we found our answer in O(n).

**Maximum Number of Balloons**
Brute force manually counts each required letter using if-else. Optimal uses a HashMap for frequency counting — since 'l' and 'o' appear twice in "balloon", we divide their counts by 2 before taking the minimum.

**Valid Anagram**
Brute force sorts both strings and compares them in O(n log n). Optimal uses a fixed-size frequency array of 26 characters — increment for string s, decrement for string t — if all values are zero, strings are anagrams in O(n).

**Group Anagrams**
Brute force compares every pair of strings by sorting them in O(n²×k). Optimal sorts each word to use as a HashMap key — all anagrams share the same sorted key and get grouped together in O(n×k log k).

## Complexity Table

| Problem | Brute Time | Brute Space | Optimal Time | Optimal Space |
|---------|-----------|-------------|--------------|---------------|
| Contains Duplicate | O(n log n) | O(1) | O(n) | O(n) |
| Two Sum | O(n²) | O(1) | O(n) | O(n) |
| Maximum Number of Balloons | O(n) | O(1) | O(n) | O(1) |
| Valid Anagram | O(n log n) | O(n) | O(n) | O(1) |
| Group Anagrams | O(n²×k) | O(n) | O(n×k log k) | O(n) |

## How to Run

```bash
# Compile karo
javac ContainsDuplicateBrute.java
java ContainsDuplicateBrute

# Ya optimal
javac ContainsDuplicateOptimal.java
java ContainsDuplicateOptimal
```