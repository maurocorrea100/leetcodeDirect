class Solution {
    public int rob(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        return Math.max(rob(nums,map,0),rob(nums,map,1));
    }

    private int rob(int[] nums, HashMap<Integer, Integer> map, int index) {
        if(index>=nums.length) return 0;
        int money = nums[index];
        if(map.containsKey(index)) return map.get(index);

        money = money + Math.max(rob(nums,map,index+2),rob(nums,map,index+3));
        map.put(index,money);
        return money;
    }
}