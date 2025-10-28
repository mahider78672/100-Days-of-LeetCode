✅ Day 37 – Problem: Stickers to Spell Word (LeetCode 691)

Problem Statement:
Given an array of stickers and a target string, return the minimum number of stickers required to form the target.
Each sticker can be reused, but each letter can only be used once per sticker.

Approach Used:

Built a frequency map for each sticker.

Used DP + memoization to cache results for sub-targets.

For each recursive call, applied stickers that reduce the target most efficiently.

Pruned redundant computations to improve performance.

Complexity:

Time: Exponential (optimized with memoization)

Space: O(2ⁿ)

Language: Java ☕
