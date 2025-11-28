Day 69 – Problem: Maximum Number of K-Divisible Components
Problem

Given a tree and a value k, count how many components can be formed such that each component’s node-sum is divisible by k.

Approach

Build adjacency list from edges

Perform DFS post-order traversal:

Calculate subtreeSum

If subtreeSum % k == 0:

Increase component counter

Return 0 (no contribution upward)

Else return subtreeSum to parent

Final answer is total components counted

Why This Works

When a subtree sum is divisible by k, it can be separated as a fully valid component.
Returning 0 ensures clean cuts and avoids overlapping value propagation.

Complexity
Type	Value
Time	O(N)
Space	O(N)
Language	Java ☕
