✅ Day 25 – Problem: Find Minimum in Rotated Sorted Array II

Problem Statement:
Find the minimum element in a rotated sorted array that may contain duplicates.

Solution Approach:

Applied Modified Binary Search.

If nums[mid] == nums[right], reduced right boundary to skip duplicates.

Compared mid with right to decide which half contains the minimum.

Complexity:

Time: O(log n) average

Space: O(1)

Language: Java ☕
