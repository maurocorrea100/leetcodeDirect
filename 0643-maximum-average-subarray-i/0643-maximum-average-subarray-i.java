class Solution {
    public double findMaxAverage(int[] nums, int k) {
              if(nums.length == 1) return nums[0];
        int right = nums.length-1;
        double sum = 0;

        for (int i = 0; i < k; i++) {
            sum+=nums[i];
        }
        double max = sum;
        int l = 0, r = l + k -1;

        while(r < nums.length){
            max = Math.max(max,sum);
            sum = sum - nums[l];
            l++;
            r++;
            if(r >= nums.length) {

                break;}
            sum = sum + nums[r];
        }
        return max/k;
    }
}