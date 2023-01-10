class Solution {
    public int longestConsecutive(int[] nums) {
        int res = 0;
        Set<Integer> set = new HashSet<>();
        for (int n:nums) set.add(n);

        for (int n:set) {
            if(set.contains(n-1)) continue;
            int count = 0;
            while(set.contains(n)){
                n++;
                count++;
            }
            if(res<count) res = count;
        }
        return res;
    }
}