✅ Day 12 – Problem: Word Break

Problem Statement:
Given a string s and a word dictionary, return true if s can be segmented into a space-separated sequence of dictionary words.

Solution Approach:

Applied Dynamic Programming.

Created DP array where dp[i] = true if s[0..i) can be segmented.

For each index, checked all previous substrings against the dictionary.

Complexity:

Time: O(n²)

Space: O(n)

Language: Java ☕
