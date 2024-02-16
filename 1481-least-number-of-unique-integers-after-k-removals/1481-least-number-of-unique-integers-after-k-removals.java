class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
         Map<Integer,Integer> map = new HashMap<>();
        for(int el:arr) if(map.putIfAbsent(el,1)!=null) map.put(el,map.get(el)+1);
        ArrayList<int[]> list = new ArrayList<>();
        for(Map.Entry<Integer,Integer> pair:map.entrySet()) list.add(new int []{pair.getKey(), pair.getValue()});
        list.sort(Comparator.comparingInt(o -> o[1]));
        int res = 0;
        for(int i = 0; i < list.size(); i++){
            int[] el = list.get(i);
            int amount = el[1];
            amount = amount - k;
            if(amount>0){
                res = list.size()-i;
                break;
            }else{
                k = k - el[1];
            }
        }


        return res;
    }
}