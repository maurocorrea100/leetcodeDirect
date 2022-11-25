class Solution {
    public int missingNumber(int[] nums) {
        if(nums.length==1 && nums[0]==0) return 1;
        if(nums.length==1 && nums[0]==1) return 0;
        return (nums.length*(1 + nums.length))/2- Arrays.stream(nums).reduce(0, (a, b) -> a + b);
    }
}