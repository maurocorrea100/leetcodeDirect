class Solution {
    public int subarraySum(int[] nums, int k) {
 if(nums.length==1){
            return nums[0] == k ? 1 : 0;
        }
       int count = 0;
       int prefixSum = 0;
      Map<Integer,Integer> map = new HashMap<>();
      map.put(0,1);

        for (int n: nums) {
            prefixSum+=n;
           count += map.getOrDefault(prefixSum - k, 0);
          //  if(prefixSum==k) count++;
            map.put(prefixSum, map.getOrDefault(prefixSum,0)+1);
        }
       return count;
    }
}