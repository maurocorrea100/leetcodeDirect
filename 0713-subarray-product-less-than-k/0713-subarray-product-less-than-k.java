class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count = 0;
        int prod = 1;
        for(int i = 0; i < nums.length; i++){
            prod = nums[i];
            if(prod < k) {
                count++;
                for(int j = i+1; j < nums.length; j++){
                    prod = prod * nums[j];
                    if(prod < k) count++;
                    else break;
                }
            }
        }
        return count;
    }
}