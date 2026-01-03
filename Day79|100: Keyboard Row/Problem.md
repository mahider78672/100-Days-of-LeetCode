Day 79 – Problem: Keyboard Row
Problem

Return all words that can be typed using letters from only one keyboard row.

Approach

Store keyboard rows in sets

For each word:

Determine row from first character

Validate all characters belong to the same row

Add valid words to result

Complexity
Aspect	Value
Time	O(N × L)
Space	O(1)
Language	Java ☕
