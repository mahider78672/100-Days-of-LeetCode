class BetterSolution {
    public void moveZeroes(int[] nums) {
      int k=0;
      for(int i=0; i<nums.length; i++){
        if(nums[i] != 0){
            nums[k]=nums[i];
            k++;
        }
      }
      for(int i=nums.length-1; i>=k; i--){
        nums[i]=0;
      }
    }
}
