class Solution {
    public int divisorSubstrings(int num, int k) {
        String s = Integer.toString(num);
        int r = s.length()-1;
        int l = r-k+1;
        int count = 0;
        while(l >= 0){
            int n = Integer.parseInt(s.substring(l,r+1));
            if(n!=0){
                if(num%n==0) count++;
            }
            l--;
            r--;
        }
        return count;
    }
}