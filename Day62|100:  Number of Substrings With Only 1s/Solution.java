class Solution {
    public int countPalindromicSubsequence(String s) {
        int count = 0;
        
        // For each possible outer character (a-z)
        for (char c = 'a'; c <= 'z'; c++) {
            int first = -1, last = -1;
            
            // Find first and last occurrence of character c
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == c) {
                    if (first == -1) first = i;
                    last = i;
                }
            }
            
            // If c appears at least twice with gap between
            if (first != -1 && last > first + 1) {
                // Count unique characters between first and last
                boolean[] seen = new boolean[26];
                for (int i = first + 1; i < last; i++) {
                    seen[s.charAt(i) - 'a'] = true;
                }
                // Each unique char forms a valid palindrome c_c
                for (boolean b : seen) {
                    if (b) count++;
                }
            }
        }
        
        return count;
    }
}
