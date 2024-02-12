class Solution {
    public int majorityElement(int[] nums) {
         HashMap<Integer,Integer> map = new HashMap<>();
        for (int el:nums){
            if(map.putIfAbsent(el,1)!=null) map.put(el,map.get(el)+1);
            if(map.get(el)>=nums.length/2+1) return el;
        }
        return -1;
    }
}