class Solution {
    public int countGoodSubstrings(String s) {
	 if(s.length() < 3) return 0;
        char a=s.charAt(0),b=s.charAt(1),c=s.charAt(2);
        int res=0;
        for(int i=3;i<=s.length()-1;i++)
        {
            if(a!=b && b!=c && c!=a) res++;
            a=b;
            b=c;
            c=s.charAt(i);
        }
        if(a!=b && b!=c && c!=a)res++;
        return res;
    }
    }
