class Solution {
    public int removeElement(int[] nums, int val) {
        int left = 0, right = nums.length-1;
        while(left <= right){
            if(nums[right] == val){
                right--;
                continue;
            }
            if(nums[left] == val){
                nums[left] = nums[right];
                nums[right] = val;
                left++;
                right--;
                continue;
            }
            left++;
        }
        return left;
    }
}