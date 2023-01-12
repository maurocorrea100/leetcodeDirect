class Solution {
    public int mostFrequentEven(int[] nums) {
                Map<Integer,Integer> map = new HashMap<>();
        
        for(int n : nums){
            if(n%2==0){
              if(map.containsKey(n)){
                    map.put(n,map.get(n)+1);
                }else{
                    map.put(n,1);
                }
            }
        }
        
        if(map.size()==0) return -1;
        
        int max = -1;
        for(int value : map.values()){
            max = Math.max(max,value);
        }
        
        List<Integer> list = new ArrayList<>();
        
        for(Map.Entry<Integer,Integer>entry: map.entrySet()){
            if(entry.getValue()==max) list.add(entry.getKey());
        }
        
        Collections.sort(list);
        
        return list.get(0);
    }
}