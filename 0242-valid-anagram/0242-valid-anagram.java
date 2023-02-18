class Solution {
    public boolean isAnagram(String s, String t) {
        
        if (s.length() != t.length())
            return false;
        
        if(s.length() == 0 && t.length() == 0)
            return true;
        
        
       HashMap<Character,Integer> hmap = new HashMap<Character,Integer>();
        
        for(int i = 0; i < s.length(); i++){
           
            char current = s.charAt(i);
            int value = 1;
            
            if(hmap.containsKey(current)){
                value = hmap.get(current);
                value++;
            }
          
            hmap.put(current, value);
        }
        
        for(int i = 0; i < t.length(); i++){
            
            char current = t.charAt(i);
            int value = 0;
            
            if(hmap.containsKey(current)){
                value = hmap.get(current);
                value--;
                hmap.put(current,value);
            }
            else
                return false;
        }
        
        for(Map.Entry<Character,Integer> entry : hmap.entrySet()) {
           
           // Character key = entry.getKey();
            Integer value = entry.getValue();
            
            if(value != 0)
                return false;

        }
        
        return true;
       
    }
    
    
}