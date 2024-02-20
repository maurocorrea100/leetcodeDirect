class Solution {
    public int missingNumber(int[] nums) {
                int sum = 0;
        for(int el:nums) sum = sum + el;
        return nums.length * (nums.length+1)/2 - Arrays.stream(nums).sum();
    }
}