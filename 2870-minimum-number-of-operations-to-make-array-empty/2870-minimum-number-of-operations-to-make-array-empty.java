class Solution {
    public int minOperations(int[] nums) {
               int max = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int el:nums){
            if(map.containsKey(el)) map.put(el, map.get(el)+1);
            else map.put(el,1);
        }

        for (Map.Entry<Integer, Integer> entry:map.entrySet()) {
            int val = entry.getValue();
            if(val < 2) return -1;
            int mod = val % 3;
            if(mod == 0) {
                max += val/3;
            } else if (mod == 2){
                max += (val-2)/3 + 1;
            } else {
                max +=(val-1)/3 + 1;
            }
        }

        return max;
    }
}