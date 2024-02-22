class Solution {
    public int findJudge(int n, int[][] trust) {
        if(n==1) return 1;
        Map<Integer,Integer> map = new HashMap<>();
        int max = 0;
        int judge = 0;
        for(int[] el:trust){
            // [1,2]
            int key = el[1];
            map.put(key,map.getOrDefault(key,0)+1);
            if(map.get(key) > max){
                max = map.get(key);
                judge = key;
            }
        }
        
         for(int[] el : trust) {
            if(el[0]==judge) return -1;
        }
        
        if(max == n-1) return judge;
        return -1;
    }
}