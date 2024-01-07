class Solution {
    public int fib(int n) {
        return fib(n, new HashMap<>());
    }
    
    public int fib(int n, HashMap<Integer,Integer> memo) {
        if(n==0) return 0;
        if(n<=2) return 1;
        
        if(memo.containsKey(n)) return memo.get(n);
        
        int res = fib(n-1, memo) + fib(n-2,memo);
        memo.put(n, res);
        
        return res;
    }
}