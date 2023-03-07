class Solution {
    public boolean isPalindrome(String s) {
        
        
        int L = 0, R = s.length()-1;
        s = s.toLowerCase();
        
        while(L < R){
            while(L < R && !Character.isLetterOrDigit(s.charAt(L))) L++;
            while(L < R && !Character.isLetterOrDigit(s.charAt(R))) R--;
            if(s.charAt(L) != s.charAt(R)) return false;
            L++;
            R--;
        }
        
        return true;
        
    }
}