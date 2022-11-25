class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> l = new ArrayList<>();
        if(nums.length==1){
            return l;
        }
        Arrays.sort(nums);
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] == nums[i+1]){
                l.add(nums[i]);
                i++;
            }
        }
        return l; 
    }
}