class NaiveSolution {
    public void moveZeroes(int[] nums) {
        int length = nums.length;
        for(int i=0; i<length; i++){
            if(nums[i]==0){
                for(int j=i; j<length-1; j++){
                    nums[j] =  nums[j+1];
                }
                nums[length-1]=0;
                i--;
            length--;
            }
        }
    }
}
