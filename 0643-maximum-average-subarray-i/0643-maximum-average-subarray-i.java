class Solution {
     public double findMaxAverage(int[] nums, int k) {
        int sumk = 0;
        for (int i=0; i<k; ++i) sumk += nums[i];

        int maxSumK = sumk;

        for (int i=k; i<nums.length; ++i) {
            sumk += nums[i] - nums[i-k];
            maxSumK = Math.max(sumk, maxSumK);
        }

        return ((double) maxSumK) / k;
    }
}