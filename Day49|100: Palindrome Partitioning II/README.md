✅ Day 49 – Problem: Palindrome Partitioning II (LeetCode 132)

Problem:
Return the minimum number of cuts needed to partition a string into palindromic substrings.

Approach:
• Computed a 2D table `isPalindrome[i][j]`.
• Used DP array `dp[i]` to store minimum cuts for prefix `s[0..i]`.
• Transition:
    - If s[0..i] is palindrome → dp[i] = 0
    - Else dp[i] = min(dp[j-1] + 1) for valid palindrome splits.

Complexity:
Time: O(N²)
Space: O(N²)

Language: Java ☕
