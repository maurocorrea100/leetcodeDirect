class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> list = new HashSet<>();

        for (int num : nums) {
            if(list.contains(num)) return true;
            list.add(num);
        }
        return false; 
    }
}