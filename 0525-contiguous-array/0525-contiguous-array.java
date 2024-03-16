class Solution {
    public int findMaxLength(int[] nums) {
         int res = 0;
        Map<Integer,Integer> map = new HashMap<>();
        int prefixSum = 0;
        
        for (int i = 0; i < nums.length; i++){
            prefixSum += nums[i] == 0 ? -1 :1;
            if(prefixSum==0) {
                if(res < i + 1) res = i+1;
            }
            else if(!map.containsKey(prefixSum)){
                map.put(prefixSum,i);
            }
            if(map.containsKey(prefixSum)){
                res = Math.max(res,i-map.get(prefixSum));
            }
        }
        return res;
    }
}