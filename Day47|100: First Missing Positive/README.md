✅ Day 47 – Problem: First Missing Positive (LeetCode 41)

Problem:
Find the smallest missing positive integer from an unsorted array,
in O(n) time and constant space.

Approach:
• Use index-based placement (Cyclic Positioning).
• Swap elements so each x is ideally stored at index x-1.
• Scan to find the first index where nums[i] != i+1.

Complexity:
Time: O(n)
Space: O(1)

Language: Java ☕
