class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       
        if(nums.length == 0) return 0;

        int minimal = Integer.MAX_VALUE;

        int l=0, r= 0;
        int sum = nums[l];
        while(l < nums.length && r< nums.length){
            if(sum>=target){
                minimal = Math.min(minimal,r-l+1);
                sum = sum - nums[l];
                l++;
            }else if(sum < target){
                r++;
                if(r >= nums.length) break;
                sum = sum + nums[r];
            }
        }
        return minimal == Integer.MAX_VALUE ? 0 : minimal;
    }
}