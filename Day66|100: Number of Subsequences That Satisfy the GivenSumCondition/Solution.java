class Solution {
    public int numSubseq(int[] nums, int target) {
        int MOD = 1_000_000_007;
        int n = nums.length;
        
        // Sort the array
        Arrays.sort(nums);
        
        // Precompute powers of 2
        int[] pow = new int[n];
        pow[0] = 1;
        for (int i = 1; i < n; i++) {
            pow[i] = (pow[i - 1] * 2) % MOD;
        }
        
        int left = 0, right = n - 1;
        int result = 0;
        
        while (left <= right) {
            if (nums[left] + nums[right] <= target) {
                // All subsequences with nums[left] as min and any element
                // from left to right as max
                result = (result + pow[right - left]) % MOD;
                left++;
            } else {
                right--;
            }
        }
        
        return result;
    }
}
