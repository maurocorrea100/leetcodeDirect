class Solution {
    public int maxScore(String s) {
        int nums1 = 0;
        for(int i=0; i<s.length(); i++)
            if(s.charAt(i)=='1') nums1++;
        if(nums1==0) return s.length()-1;
        int max = 0;
        int digit0 = 0;

        for(int i = 0; i < s.length()-1; i++){
            if(s.charAt(i)=='0') digit0++;
            else nums1--;
            max = Math.max(max, digit0+nums1);
        }
      
        return max;

    }
}