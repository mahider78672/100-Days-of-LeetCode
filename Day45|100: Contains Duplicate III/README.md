✅ Day 45 – Problem: Contains Duplicate III (LeetCode 220)

Problem:
Check if two indices i and j exist such that:
1) |i - j| ≤ k
2) |nums[i] - nums[j]| ≤ t

Approach:
Used a TreeSet to maintain a sliding window of last k elements.
Used ceiling() to find closest element ≥ current value.
Checked if difference ≤ t before insertion.

Complexity:
Time: O(n log k)
Space: O(k)

Language: Java ☕
