Day 68 – Problem: Maximum Subarray Sum With Length Divisible by K
Problem

Find the maximum subarray sum where the subarray length is divisible by k.

Approach

Build a prefix sum array:

prefix[i] = sum(nums[0..i-1])


Subarray from l to r has length divisible by k if:

(r - l) % k == 0  →  r % k == l % k


Maintain an array minPrefix[k] storing the smallest prefix sum seen for each remainder group.

For each i:

rem = i % k

Consider candidate:

result = prefix[i] - minPrefix[rem]


Update minPrefix[rem]

Complexity
Type	Value
Time	O(N)
Space	O(K)
Language	Java ☕
