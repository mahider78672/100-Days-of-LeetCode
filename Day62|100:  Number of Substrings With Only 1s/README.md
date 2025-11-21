Day 62 – Problem: Number of Substrings With Only 1s
Problem

Given a binary string, determine how many substrings consist entirely of the character '1'.

A substring is valid only if it is continuous and contains no '0'.

Approach

Instead of explicitly generating substrings, the solution observes:

A run of k consecutive 1s produces
k(k + 1) / 2 substrings.

Steps:

Iterate through the string.

Count the length of the current run of consecutive 1s.

Whenever a 0 breaks the sequence, compute contributions using the formula and reset the counter.

Add the final run’s contribution after the loop.

This avoids substring creation and keeps computation strictly linear.

Complexity

Time: O(N)

Space: O(1)

Language

Java ☕
