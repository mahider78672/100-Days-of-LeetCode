class Solution(object):
    def minOperations(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        total_sum = sum(nums)
        remainder = total_sum % k
        
        # If remainder is 0, sum is already divisible by k
        if remainder == 0:
            return 0
        
        # Otherwise, we need to reduce the sum by 'remainder' amount
        # This requires 'remainder' operations
        return remainder
