class Solution {
    public int maxSumDivThree(int[] nums) {
        int[] dp = new int[3];
        
        for (int num : nums) {
            int[] temp = dp.clone();
            for (int i = 0; i < 3; i++) {
                int newRemainder = (temp[i] + num) % 3;
                dp[newRemainder] = Math.max(dp[newRemainder], temp[i] + num);
            }
        }
        
        return dp[0];
    }
}
