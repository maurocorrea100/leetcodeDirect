class Solution {
    public int countGoodSubstrings(String s) {
         if(s.length() < 3) return 0;
        Set<Character> set = new HashSet<>();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            int j = i;
            while(j-i < 3 && j < s.length()){
                if(set.add(s.charAt(j))){
                    if(j-i+1 == 3){
                        count++;
                        set.clear();
                        break;
                    }
                    j++;
                }else{
                    set.clear();
                    break;
                }
            }
        }

        return count;
    }
}