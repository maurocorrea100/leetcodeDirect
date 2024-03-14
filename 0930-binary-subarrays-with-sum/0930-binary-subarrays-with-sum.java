class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
      int count = 0;
        for(int left = 0; left < nums.length; left++){
            int sum = 0;
            for(int right = left; right < nums.length; right++){
                sum = sum + nums[right];
                if(sum == goal) count++;
                if(sum > goal) break;
            }
        }
        return count;
    }
}