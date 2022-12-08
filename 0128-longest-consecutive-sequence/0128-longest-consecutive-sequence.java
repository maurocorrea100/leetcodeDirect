class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        
        Arrays.sort(nums);
      //  System.out.println(Arrays.toString(nums));
        int longestCons = 0;
        int temp = 0;
        for (int i = 1; i < nums.length; i++) {
             if(nums[i] == nums[i-1]){
                continue;
            }
            if(nums[i]-1 == nums[i-1]){
                temp++;
            }else{
                longestCons = Math.max(longestCons,temp);
                temp = 0;
            }
        }
        longestCons = Math.max(longestCons,temp);
        return longestCons+1;
    }
}