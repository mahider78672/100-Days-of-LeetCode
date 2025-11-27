class Solution:
    def maxSubarraySum(self, nums, k):
        """
        Find the maximum sum of a subarray where length is divisible by k.
        
        Args:
            nums: List of integers
            k: Integer divisor for subarray length
            
        Returns:
            Maximum sum of valid subarray
        """
        n = len(nums)
        
        # Calculate prefix sums
        prefix = [0]
        for num in nums:
            prefix.append(prefix[-1] + num)
        
        # Track minimum prefix sum for each remainder modulo k
        # min_prefix[r] = minimum prefix sum at positions with remainder r
        min_prefix = {}
        max_sum = float('-inf')
        
        for i in range(n + 1):
            remainder = i % k
            
            # If we've seen this remainder before, calculate subarray sum
            if remainder in min_prefix:
                # Subarray sum from that position to current position
                subarray_sum = prefix[i] - min_prefix[remainder]
                max_sum = max(max_sum, subarray_sum)
            
            # Update minimum prefix sum for this remainder
            if remainder not in min_prefix:
                min_prefix[remainder] = prefix[i]
            else:
                min_prefix[remainder] = min(min_prefix[remainder], prefix[i])
        
        return max_sum
