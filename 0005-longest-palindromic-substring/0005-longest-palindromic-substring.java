class Solution {
    public String longestPalindrome(String s) {
        if (s.length()==1) return s;
         String pali = s.charAt(0)+"";
        for (int i = 0; i < s.length(); i++){

            for (int j = i+1; j < s.length(); j++){
             //   if(pali.length()>j+1-i) break;
                if(pali.length() < (j-i+1) && isPlaindrome(s.substring(i,j+1))){
                    pali = s.substring(i,j+1);
                }
            }
        }
        return pali;
    }
    
    private  boolean isPlaindrome(String substring) {
        int l = 0, r = substring.length()-1;
        while(l<r){
            if(substring.charAt(l) != substring.charAt(r)){
                return false;
            }
            l++; r--;
        }
        return true;
    }
}