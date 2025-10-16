class Solution {
    public int findMin(int[] nums) {
         int left = 0, right = nums.length - 1;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            // If mid element is greater than right, the minimum is in the right part
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            }
            // If mid element is less than right, the minimum is in the left part
            else if (nums[mid] < nums[right]) {
                right = mid;
            }
            // If mid element equals right, we can't decide the part, so shrink the search space
            else {
                right--;
            }
        }
        
        return nums[left];
    }
}
