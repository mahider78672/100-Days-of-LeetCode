✅ Day 59 – Problem: 1-bit and 2-bit Characters

Problem:
Determine whether the last character is represented as a 1-bit character based on binary rules:
0 -> one-bit
10/11 -> two-bit

Approach:
• Traverse using greedy jumping:
    - If bit is 0 → move by 1
    - If bit is 1 → move by 2
• Last position reached determines the answer.

Complexity:
Time: O(N)
Space: O(1)

Language: Java ☕
