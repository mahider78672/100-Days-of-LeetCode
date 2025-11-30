Day 71 – Problem: Make Sum Divisible by P (LeetCode 1590)
Problem

Find the smallest subarray to remove so the sum of remaining elements becomes divisible by p.
Return the subarray length or -1 if no valid removal exists.

Approach

Compute total sum and remainder r = sum % p

If r == 0, no need to remove anything → return 0

Use a hash map to store prefix remainders and track indices

For each prefix sum:

Compute remainder curr = prefix % p

Compute target (curr - r + p) % p

If target seen before → update minimal length

If minimal window < array length → return it, else -1

Complexity
Aspect	Complexity
Time	O(N)
Space	O(N)
Language	Java ☕
