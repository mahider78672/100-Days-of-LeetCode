Day 66 – Problem: Number of Subsequences That Satisfy the Given Sum Condition (LeetCode 1498)

Problem:
Count all subsequences where the sum of the minimum and maximum elements is ≤ target.

Approach Used

Sort the array to easily pair the minimum (left) and maximum (right) elements.

Use two pointers:

If nums[l] + nums[r] <= target, then:

All subsequences formed using nums[l] as min

And any subset of elements between l and r as remaining

Count = 2^(r - l)

Move l forward

Else move r backward

Precompute powers of 2 modulo 1_000_000_007 to avoid repeated exponentiation.

This avoids brute-force enumeration of subsequences and turns the problem into a mathematical counting challenge.

Why This Works

In a sorted array, nums[l] is the smallest and nums[r] the largest in a chosen subsequence.

If their sum ≤ target, then ANY combination of the elements between them is valid.

That yields 2^(r - l) possibilities.

Using two pointers ensures each valid pair is counted once.

Complexity

Time: O(N log N)

Space: O(N)

Language: Java ☕
