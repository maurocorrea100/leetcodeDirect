class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        // count els of num1 in map
        Map<Integer,Integer> map = new HashMap<>();
        for(int el : nums1) {
            if(!map.containsKey(el)) map.put(el,1);
            else map.put(el, map.get(el)+1);
        }
        // go thru els of num2 and check if:
        // el exists in map and its val>0 -> add el to res and reduce val by -1
        for(int el : nums2){
            if(map.containsKey(el) && map.get(el)>0 ){
                list.add(el);
                map.put(el,map.get(el)-1);
            }
        }
        // return res as int arr
        int[] res = new int[list.size()];
        for(int i = 0; i<list.size(); i++) res[i] = list.get(i);
        return res;
    }
}