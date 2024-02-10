class Solution {
   public int countSubstrings(String s) {
        int res = s.length();
        for(int i = 0; i< s.length();i++){
            for(int j = i+1; j < s.length(); j++){
                String temp = s.substring(i,j+1);
                if(isPali(temp)) res++;
            }
        }
        return res;
    }

    private boolean isPali(String temp) {
        int l = 0, r = temp.length()-1;
        while(l<r){
            if(temp.charAt(l)!=temp.charAt(r)) return false;
            l++;r--;
        }
        return true;
    }
}