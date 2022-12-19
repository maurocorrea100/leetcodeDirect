class Solution {
    public int longestSubstring(String s, int k) {
        return divideAndConquer(0, s.length(),s,k);    
    }
    
    public int divideAndConquer(int start, int end, String s, int k){
        int[] charCount = new int[26];
        
        for(int i = start; i < end; i++){
            charCount[s.charAt(i) - 'a']++;
        }
        
        for(int j = start; j < end; j++){
            int count = charCount[s.charAt(j) - 'a'];
            if(count>0 && count < k){
                int leftside = divideAndConquer(start, j , s, k);
                int rightside = divideAndConquer(j+1,end,s,k);
                return Math.max(leftside, rightside);
            }
        }
        return end-start;
    }
    
}