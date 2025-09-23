class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int size = nums.length;
        for(int i=0; i<size; i++){
            if(hm.containsKey(target - nums[i])){
                return new int[] {hm.get(target - nums[i]), i};
            }
            hm.put(nums[i], i);
        }
        return new int[] {-1, -1};
    }
}
