Day 60 – Keep Multiplying Found Values by Two (LeetCode)
Detailed GitHub README Entry
📝 Problem Description

You are given:

An integer array nums

An integer original

Your task is to keep doubling the value of original as long as it exists in the array.
Once the value no longer appears in the array, return the final updated value.

Example
nums = [5, 3, 6, 1, 12]
original = 3

3 exists → multiply to 6  
6 exists → multiply to 12  
12 exists → multiply to 24  
24 not found → return 24


The process ends when the doubled value is no longer present in the array.

💡 Intuition

The problem is essentially a repeated membership check:

“Is this number present? If yes → multiply it by 2.”

Doing this with a list would be O(N) each time → inefficient.

The smart way is to use a HashSet for O(1) membership operations.

🧠 Approach (Detailed Explanation)

Convert the array into a HashSet
This allows constant-time lookups when checking if the current value exists.

Start with the given original value
This becomes our current value to test.

Iteratively check presence:

If set.contains(currentValue) → multiply by 2

Continue until the set no longer contains the value

Return the final value
This is the first number in the doubling process that does not appear in the array.

⏱️ Time & Space Complexity
Time Complexity → O(N)

Building the HashSet takes O(N).

Each lookup is O(1) and you perform at most log(max(nums)) multiplications.

Space Complexity → O(N)

The HashSet stores all elements from the input array.
