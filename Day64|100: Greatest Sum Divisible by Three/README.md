Day 64 – Problem: Greatest Sum Divisible by Three

Problem:
Select a subset of numbers such that the sum is as large as possible and divisible by 3.

Approach Used

This problem revolves around understanding how remainders affect divisibility by 3:

Let total = sum(nums)

If total % 3 == 0 → return total directly.

Otherwise:

If total % 3 == 1
Remove either:
• smallest number with remainder 1
or
• two smallest numbers with remainder 2

If total % 3 == 2
Remove either:
• smallest number with remainder 2
or
• two smallest numbers with remainder 1

Whichever removal keeps the sum highest is the answer.

Why This Works

Divisibility by 3 is governed entirely by the remainder of the sum.
Instead of exploring combinations (exponential), we use:

Remainder groups

Greedy removal

Minimizing loss while fixing divisibility

This transforms a potential DP problem into a mathematical optimization.

Complexity

Time: O(N log N)

Space: O(N)

Language: Java ☕
