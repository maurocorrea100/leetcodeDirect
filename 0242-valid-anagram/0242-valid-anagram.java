class Solution {
    public boolean isAnagram(String s, String t) {
        
        if (s.length() != t.length())
            return false;
        
        int[] counter = new int[26];
        
        for(int i = 0; i < s.length(); i++){
            counter[s.charAt(i) - 'a']++;
        }
        
        for(int i = 0; i < s.length(); i++){
            int index = t.charAt(i) - 'a';
            counter[index]--;
            if(counter[index]<0) return false;
        }
        
        for(int element : counter){
            if(element > 0)
                return false;
        }
       
        return true;
    }
    
    
}