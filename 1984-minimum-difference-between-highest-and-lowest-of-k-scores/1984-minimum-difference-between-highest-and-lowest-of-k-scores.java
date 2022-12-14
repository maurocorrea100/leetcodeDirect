class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        
        int start=0;
        int end=k-1;
        int OvrMin=Integer.MAX_VALUE;
        
        int N=nums.length;
        
        while(end<N)
        {
               int diff=nums[end]-nums[start];
            
               OvrMin=Math.min(OvrMin,diff);
            
                start++;
                end++;
        }//
        
        return OvrMin;
    }
}