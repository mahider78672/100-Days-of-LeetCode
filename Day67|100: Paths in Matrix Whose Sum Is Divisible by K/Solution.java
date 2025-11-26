class Solution {
    public int numberOfPaths(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int MOD = 1_000_000_007;
        
        // dp[i][j][r] = number of ways to reach (i,j) with sum % k = r
        // We can optimize space by using only current and previous row
        int[][][] dp = new int[m][n][k];
        
        // Initialize starting position
        dp[0][0][grid[0][0] % k] = 1;
        
        // Fill first row
        for (int j = 1; j < n; j++) {
            for (int r = 0; r < k; r++) {
                if (dp[0][j-1][r] > 0) {
                    int newRem = (r + grid[0][j]) % k;
                    dp[0][j][newRem] = (dp[0][j][newRem] + dp[0][j-1][r]) % MOD;
                }
            }
        }
        
        // Fill first column
        for (int i = 1; i < m; i++) {
            for (int r = 0; r < k; r++) {
                if (dp[i-1][0][r] > 0) {
                    int newRem = (r + grid[i][0]) % k;
                    dp[i][0][newRem] = (dp[i][0][newRem] + dp[i-1][0][r]) % MOD;
                }
            }
        }
        
        // Fill rest of the grid
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                for (int r = 0; r < k; r++) {
                    // Coming from top
                    if (dp[i-1][j][r] > 0) {
                        int newRem = (r + grid[i][j]) % k;
                        dp[i][j][newRem] = (dp[i][j][newRem] + dp[i-1][j][r]) % MOD;
                    }
                    // Coming from left
                    if (dp[i][j-1][r] > 0) {
                        int newRem = (r + grid[i][j]) % k;
                        dp[i][j][newRem] = (dp[i][j][newRem] + dp[i][j-1][r]) % MOD;
                    }
                }
            }
        }
        
        return dp[m-1][n-1][0];
    }
}
