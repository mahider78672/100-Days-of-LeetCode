Day 61 – Problem: Unique Length-3 Palindromic Subsequences
Problem

You must count how many distinct palindromic subsequences of length 3 exist in a given string.
A valid palindrome must follow the form x _ y _ x, where the outer characters are the same.

Approach

The key insight is that generating all subsequences would be expensive and unnecessary.
Instead:

For each lowercase letter 'a' → 'z':

Locate its first and last index in the string.

If they exist and are different, then all characters between them can act as middle characters.

Add each distinct middle character to a set.

The number of unique middle characters for each outer character gives the count of unique palindromes contributed by that letter.

This ensures:

No duplicates

No brute-force subsequence generation

Fully optimal traversal

Complexity

Time: O(26 × N) → effectively O(N)

Space: O(1) (fixed alphabet size)

Language

Java ☕
