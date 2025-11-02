✅ Day 42 – Problem: Permutation Sequence (LeetCode 60)

Approach Summary:

Precomputed factorials.

Maintained a list of available digits.

At each position:

Determined the correct digit using k / (n-1)!

Updated k and continued building the answer.

Avoided generating all permutations.

Complexity:

Time: O(n²)

Space: O(n)

Language: Java ☕
