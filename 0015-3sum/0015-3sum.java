class Solution {
    
   		public  List<List<Integer>> threeSum(int[] nums) {

		       Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length-2; i++){
            int j = i + 1;
            int k = nums.length-1;

            while(j<k){
            sum = nums[i] + nums[j] + nums[k];
            if(sum==0){
                set.add(Arrays.asList(nums[i],nums[j],nums[k]));
                j++;
                k--;
            }
            if(sum > 0) k--;
            if(sum < 0) j++;
            }
        }

        List<List<Integer>> res = new ArrayList<>(set);
        return res;
		}
}