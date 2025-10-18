✅ Day 26 – Problem: Wildcard Matching

Problem Statement:
Implement pattern matching with wildcards '?' and '*'.

Solution Approach:

Used Dynamic Programming.

Initialized DP for empty pattern and empty string cases.

For each char, handled:

'?' → single char match

'*' → zero or more chars match

Complexity:

Time: O(n × m)

Space: O(n × m)

Language: Java ☕
