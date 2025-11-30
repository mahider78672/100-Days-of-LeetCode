class Solution(object):
    def minSubarray(self, nums, p):
        """
        :type nums: List[int]
        :type p: int
        :rtype: int
        """
        total_sum = sum(nums)
        target_remainder = total_sum % p
        
        # If already divisible, no need to remove anything
        if target_remainder == 0:
            return 0
        
        # Hash map to store the most recent index where each prefix_sum % p occurs
        # Initialize with remainder 0 at index -1 (before the array starts)
        remainder_map = {0: -1}
        
        prefix_sum = 0
        min_length = len(nums)
        
        for i in range(len(nums)):
            prefix_sum += nums[i]
            current_remainder = prefix_sum % p
            
            # We want to find a previous prefix sum such that:
            # (current_remainder - previous_remainder) % p == target_remainder
            # Which means: previous_remainder = (current_remainder - target_remainder) % p
            needed_remainder = (current_remainder - target_remainder) % p
            
            if needed_remainder in remainder_map:
                subarray_length = i - remainder_map[needed_remainder]
                min_length = min(min_length, subarray_length)
            
            # Update the map with current remainder
            remainder_map[current_remainder] = i
        
        # If min_length is still len(nums), we would need to remove the entire array
        return min_length if min_length < len(nums) else -1
