class EfficientSolution {
    public void moveZeroes(int[] nums) {
        int index = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                if(i != index){
                    int temp = nums[i];
                    nums[i] = nums[index];
                    nums[index] = temp;
                }
                index++;
            }
        }
    }
}
