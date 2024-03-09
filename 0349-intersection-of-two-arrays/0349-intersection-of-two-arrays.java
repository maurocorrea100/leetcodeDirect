class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for(int el : nums1) set.add(el);
        ArrayList<Integer> list = new ArrayList<>();
        for(int el : nums2) if(set.contains(el) && !list.contains(el)) list.add(el);
        int[] ret = new int[list.size()];
        for (int i=0; i < ret.length; i++) ret[i] = list.get(i);
        return ret;
    }
}