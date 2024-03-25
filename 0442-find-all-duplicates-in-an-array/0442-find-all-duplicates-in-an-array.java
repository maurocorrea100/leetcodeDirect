class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for(int el : nums) if(!set.add(el)) list.add(el);
        return list;
    }
}