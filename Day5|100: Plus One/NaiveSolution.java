class NaiveSolution {
    public int[] plusOne(int[] digits) {
        int index =  digits.length-1;
        if(digits[index] != 9){
            digits[index]++;
            return digits;
        }
        int carry = 0;
        while(index >= 0 && digits[index] ==9){
            digits[index] =0;
            carry = 1;    
            index--;
        }
        if(index == -1){
            int[] temp = new int[digits.length+1];
            temp[0] = 1;
            return temp;
        }
        digits[index]++;
        return digits;
    }
}
