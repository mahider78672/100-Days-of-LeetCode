✅ Day 54 – Problem: Count the Number of Substrings With Dominant Ones

Problem:
Given a binary string and integer k, count all substrings where:
  number_of_1s > number_of_0s × k

Approach:
• Used Sliding Window + Two Pointers.
• Move right pointer through the string.
• Shrink window from the left whenever dominance breaks.
• For each valid window, add (left + 1) substrings to count.

Complexity:
Time: O(N)
Space: O(1)

Language: Java ☕
