class Solution {
    public int pivotIndex(int[] nums) {
        if(nums.length==1) return 0;
        int sum1 = 0, sum2 = 0;
        for (int num: nums) {
            sum1+=num;
        }
        int lIndex = 0;
        while(lIndex<nums.length){
            sum1 = sum1 - nums[lIndex];
            if(sum1 == sum2) return lIndex;
            sum2 = sum2 + nums[lIndex];
            lIndex++;
        }

      //  if(sum1 == sum2) return --lIndex;
        return -1;
    }
}