class Solution {
    public String firstPalindrome(String[] words) {
         for(String el : words) if(isPoly(el)) return el;
        return "";
    }
    
    public boolean isPoly(String el){
        int l=0, r = el.length()-1;
        while(l<r){
           if(el.charAt(l) != el.charAt(r)) return false;
           l++; r--;
        }
        return true;
    }
}