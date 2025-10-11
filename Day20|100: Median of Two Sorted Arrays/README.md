✅ Day 20 – Problem: Median of Two Sorted Arrays

Problem Statement:
Find the median of two sorted arrays nums1 and nums2 with O(log(m + n)) complexity.

Solution Approach:

Used Binary Search on the smaller array.

Ensured correct partition such that left max ≤ right min.

Calculated median from boundary values.

Complexity:

Time: O(log(min(m, n)))

Space: O(1)

Language: Java ☕
