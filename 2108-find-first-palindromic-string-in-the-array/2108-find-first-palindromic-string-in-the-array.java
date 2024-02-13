class Solution {
    public String firstPalindrome(String[] words) {
         for(String el : words) {
            if(el.length()==1) return el;
            int l=0, r = el.length()-1;
            boolean isPoly = true;
            while(l<r){
                if(el.charAt(l) != el.charAt(r)){
                    isPoly=false;
                    break;
                }
                l++;
                r--;
            }
            if(isPoly) return el;
        }
        
        return "";
    }
}