class Solution {
    public int[] productExceptSelf(int[] nums) {
        int multi  = 1;
        boolean hasZero = false;
        int amountZero = 0;
        for(int el : nums){
            if(el==0) {
                hasZero = true;
                amountZero++;
            }
            else multi *= el;
        }
        
        for(int i = 0; i < nums.length; i++){
            if(hasZero && amountZero > 1){
                nums[i] = 0;
            }else if(hasZero && amountZero == 1){
                if(nums[i]==0) nums[i] = multi;
                else nums[i] = 0;
            }else nums[i] = multi/nums[i];
        }
        return nums;
    }
}