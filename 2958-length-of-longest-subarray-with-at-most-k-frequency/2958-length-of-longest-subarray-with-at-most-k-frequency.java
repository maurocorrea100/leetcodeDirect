class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
         
        Map<Integer, Integer> map = new HashMap<>();

        int left = 0, right = 0;
        int max = 0;
        while(left<=right && right < nums.length){
            int el = nums[right];
            if(!map.containsKey(el)) map.put(el,1);
            else map.put(el, map.get(el)+1);

            int amount = map.get(el);
            if(amount<=k) right++;
            else{
                while(nums[left] != el){
                    int leftEl = nums[left];
                    map.put(leftEl, map.get(leftEl)-1);
                    if(map.get(leftEl)==0) map.remove(leftEl);
                    left++;
                }
                int leftEl = nums[left];
                map.put(leftEl, map.get(leftEl)-1);
                if(map.get(leftEl)==0) map.remove(leftEl);
                left++;
                right++;
            }
            max = Math.max(max,right-left);

        }

        return max;
    }
}