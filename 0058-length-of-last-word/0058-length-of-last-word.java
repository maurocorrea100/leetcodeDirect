class Solution {
    public int lengthOfLastWord(String s) {
         s = s.trim();
        int indexOfSpace = s.lastIndexOf(" ");
        s = s.substring(indexOfSpace+1);
        return  s.length();
    }
}