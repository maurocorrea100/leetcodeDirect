class Solution {
    public int characterReplacement(String s, int k) {
   int max = 0;
        int res = 0;

        int l=0, r=0;
        Map<Character,Integer> map = new HashMap<>();
        map.putIfAbsent(s.charAt(r),1);
        while(r<s.length()  ){
            if(s.length()- l <= res) break;
            max = Collections.max(map.values());
            if(r-l+1-max<=k){
                res = Math.max(res,r-l+1);
                r++;
                if(s.length()>r){
                    if(map.containsKey(s.charAt(r))){
                        map.put(s.charAt(r),map.get(s.charAt(r))+1);
                    }else{
                        map.put(s.charAt(r),1);
                    }
                }
            }else{
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
                l++;
            }
        }
        return res;

    }
}