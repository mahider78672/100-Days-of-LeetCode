✅ Day 19 – Problem: Regular Expression Matching

Problem Statement:
Implement regex matching for string s and pattern p supporting . and *.
Ensure the entire string is matched.

Solution Approach:

Used Dynamic Programming to evaluate sub-pattern matches.

Managed conditions for . (any char) and * (zero/more repeats).

Final result stored in dp[s.length()][p.length()].

Complexity:

Time: O(m × n)

Space: O(m × n)

Language: Java ☕
