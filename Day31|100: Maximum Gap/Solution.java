class Solution {
    public int maximumGap(int[] nums) {
          if (nums == null || nums.length < 2) return 0;
        
        int n = nums.length;
        int min = nums[0], max = nums[0];
        
        // Find global min and max
        for (int num : nums) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        
        if (min == max) return 0; // all elements are the same
        
        // Calculate bucket size and count
        int gap = (int) Math.ceil((double)(max - min) / (n - 1));
        int bucketCount = (max - min) / gap + 1;
        
        int[] bucketMin = new int[bucketCount];
        int[] bucketMax = new int[bucketCount];
        boolean[] bucketUsed = new boolean[bucketCount];
        
        // Initialize buckets
        for (int i = 0; i < bucketCount; i++) {
            bucketMin[i] = Integer.MAX_VALUE;
            bucketMax[i] = Integer.MIN_VALUE;
        }
        
        // Distribute the numbers into buckets
        for (int num : nums) {
            int bucketIndex = (num - min) / gap;
            bucketMin[bucketIndex] = Math.min(bucketMin[bucketIndex], num);
            bucketMax[bucketIndex] = Math.max(bucketMax[bucketIndex], num);
            bucketUsed[bucketIndex] = true;
        }
        
        // Scan buckets to find maximum gap
        int maxGap = 0;
        int previousMax = min;
        
        for (int i = 0; i < bucketCount; i++) {
            if (!bucketUsed[i]) continue;
            maxGap = Math.max(maxGap, bucketMin[i] - previousMax);
            previousMax = bucketMax[i];
        }
        
        return maxGap;
    }
}
