✅ Day 46 – Problem: Word Ladder (LeetCode 127)

Problem:
Transform beginWord to endWord by changing one character at a time,
where each intermediate word must exist in the dictionary.

Approach:
• Created intermediate word patterns for fast lookups.
• Used BFS to find the shortest transformation sequence.
• Incremented level count at each BFS depth layer.

Complexity:
Time: O(N × L²)
Space: O(N × L)

Language: Java ☕
