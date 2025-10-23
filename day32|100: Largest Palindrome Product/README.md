✅ Day 32 – Problem: Largest Palindrome Product (LeetCode 479)

Problem Statement:
Find the largest palindrome made from the product of two n-digit numbers.
Return it modulo 1337.

Approach Used:

Started from the largest n-digit number and iterated downward.

Generated palindrome candidates by reversing the upper half.

Checked divisibility within range and stopped early when no larger palindrome possible.

Complexity:

Time: O(10ⁿ) (optimized)

Space: O(1)

Language: Java ☕
