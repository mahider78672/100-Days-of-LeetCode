✅ Day 35 – Problem: Minimum Window Substring (LeetCode 76)

Problem Statement:
Given two strings s and t, find the minimum window substring in s that contains all characters of t.

Approach Used:

Used the Sliding Window approach with Two Pointers.

A HashMap was used to track frequency of characters needed.

Expanded the right pointer to include characters until all were found.

Contracted the left pointer to minimize the window while maintaining validity.

Complexity:

Time: O(|s| + |t|)

Space: O(|t|)

Language: Java ☕
