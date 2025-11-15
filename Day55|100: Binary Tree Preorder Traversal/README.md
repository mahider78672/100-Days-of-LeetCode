✅ Day 55 – Problem: Binary Tree Preorder Traversal

Problem:
Return the preorder traversal of a binary tree (Root → Left → Right).

Approach:
• Recursive DFS:
    - Visit root, recurse left, recurse right.
• Iterative stack-based traversal:
    - Use a stack, push right child first, then left.

Complexity:
Time: O(N)
Space:
    - Recursive: O(H)
    - Iterative: O(N)

Language: Java ☕
