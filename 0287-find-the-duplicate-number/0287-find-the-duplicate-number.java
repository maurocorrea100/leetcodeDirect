class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        
        for(int el : nums) if(set.add(el)==false) return el;
        
        return -1;
    }
}