class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       
        if(nums.length == 0) return 0;

        int minimal = Integer.MAX_VALUE;

        int start=0;
        int sum =0;
        for(int end = 0; end < nums.length; end++){
            sum = sum + nums[end];
            
            while(sum>=target){
                minimal = Math.min(minimal, end-start+1);
                sum = sum - nums[start];
                start++;
            }
        }
        return minimal == Integer.MAX_VALUE ? 0 : minimal;
    }
}