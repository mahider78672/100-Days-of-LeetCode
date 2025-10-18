class Solution {
    public int maxCoins(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n + 2];
        arr[0] = arr[n + 1] = 1;
        for (int i = 0; i < n; i++) arr[i + 1] = nums[i];

        int[][] dp = new int[n + 2][n + 2];

        // len is the distance between left and right boundaries
        for (int len = 2; len < n + 2; len++) {
            for (int left = 0; left < n + 2 - len; left++) {
                int right = left + len;
                for (int i = left + 1; i < right; i++) {
                    dp[left][right] = Math.max(dp[left][right],
                        arr[left] * arr[i] * arr[right] + dp[left][i] + dp[i][right]);
                }
            }
        }

        return dp[0][n + 1];
    }
}
