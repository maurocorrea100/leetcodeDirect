class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < nums.length; i++){
            int temp = Math.abs(nums[i]) - 1;
            if(nums[temp]<0) l.add(Math.abs(nums[i]));
            nums[temp] *= -1;
        }
        return l;
    }
}