Day 70 – Problem: Minimum Operations to Make Array Sum Divisible by K
Problem Explanation

Given array nums and integer k, you may modify any element in one operation.
Return the minimum number of operations needed so that the sum(nums) % k == 0.

Approach

Compute the total sum of array elements

Calculate remainder r = sum % k

If r == 0, the sum is already divisible → 0 operations

Otherwise, adjust any single element by ±r, making sum divisible → 1 operation

Key Insight

Changing one element can always compensate for the remainder, making additional operations unnecessary.

Complexity
Aspect	Value
Time	O(N)
Space	O(1)
Language	Java ☕
