✅ Day 58 – Problem: Longest Uncommon Subsequence II

Problem:
Given a list of strings, return the length of the longest string that is not a subsequence of any other string.

Approach:
• For each string, check if it appears as a subsequence in any other.
• If it doesn't, it is a valid LUS candidate.
• Track the maximum length among all valid candidates.
• Used a two-pointer approach to check subsequences efficiently.

Complexity:
Time: O(N² × L)
Space: O(1)

Language: Java ☕
