✅ Day 56 – Problem: Binary Tree Postorder Traversal

Problem:
Return the postorder traversal of a binary tree (Left → Right → Root).

Approach:
• Recursive DFS:
    - Traverse left, traverse right, then process root.
• Iterative:
    - Use stack to simulate reverse-preorder (Root → Right → Left).
    - Reverse list to get postorder.

Complexity:
Time: O(N)
Space:
    - Recursive: O(H)
    - Iterative: O(N)

Language: Java ☕
