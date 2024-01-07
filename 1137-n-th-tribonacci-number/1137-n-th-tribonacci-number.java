class Solution {
    public int tribonacci(int n) {
       HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,0);
        map.put(1,1);
        map.put(2,1);
        return tribonacci(n, map);
    }
    
    public int tribonacci(int n, HashMap<Integer,Integer> map) {
      
        if(map.containsKey(n)) return map.get(n);
        
        int res = tribonacci(n-1,map) + tribonacci(n-2,map) + tribonacci(n-3,map);
        map.put(n,res);
        return res;
    }
}