class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
     Map<Integer,Integer> map = new HashMap<>();
        for(int a:arr) map.put(a, 1 + map.getOrDefault(a, 0));
        List<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list);
        int res = 0;
        for(int i = 0; i < list.size(); i++){
            int el = list.get(i);
            int amount = el;
            amount = amount - k;
            if(amount>0){
                res = list.size()-i;
                break;
            }else{
                k = k - el;
            }
        }


        return res;
    }
}