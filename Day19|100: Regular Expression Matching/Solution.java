class Solution {
    public boolean isMatch(String s, String p) {
         boolean[][] dp = new boolean[s.length() + 1][p.length() + 1];
        dp[0][0] = true;

        // Handle patterns like a*, a*b*, a*b*c* etc.
        for (int j = 1; j < p.length(); j++) {
            if (p.charAt(j) == '*' && dp[0][j - 1]) {
                dp[0][j + 1] = true;
            }
        }

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < p.length(); j++) {
                char sc = s.charAt(i);
                char pc = p.charAt(j);

                if (pc == sc || pc == '.') {
                    dp[i + 1][j + 1] = dp[i][j];
                } else if (pc == '*') {
                    char prev = p.charAt(j - 1);
                    // '*' means zero of previous char
                    dp[i + 1][j + 1] = dp[i + 1][j - 1];
                    // '*' means one or more of previous char
                    if (prev == sc || prev == '.') {
                        dp[i + 1][j + 1] |= dp[i][j + 1];
                    }
                }
            }
        }
        return dp[s.length()][p.length()];
    }
}
