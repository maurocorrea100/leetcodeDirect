class Solution {
    public boolean uniqueOccurrences(int[] arr) {
         HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int el : arr){
            if(!map.containsKey(el)) map.put(el,1);
            else map.put(el,map.get(el)+1);
        }
        
        HashSet<Integer> set = new HashSet<>();
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(!set.add(entry.getValue())) return false;
        }
        
        return true;
    }
}