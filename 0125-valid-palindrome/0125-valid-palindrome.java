class Solution {
    public boolean isPalindrome(String s) {
       
        ArrayList<Character> arr = new ArrayList<Character>();
       
        
        for(int i = 0; i < s.length(); i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                arr.add(Character.toLowerCase(s.charAt(i))); 
            }
        }
        
        int i = 0;
        int j = arr.size() - 1;
        
        while(i<j){
            if(arr.get(i)!=arr.get(j))
                return false;
            i++;
            j--;
        }
        
        return true;
    }
}