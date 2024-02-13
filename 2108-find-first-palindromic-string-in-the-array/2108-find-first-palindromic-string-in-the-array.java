class Solution {
    public String firstPalindrome(String[] words) {
        for(String el : words) if(IntStream.range(0, el.length() / 2).allMatch(i -> el.charAt(i) == el.charAt(el.length() - i - 1))) return el;
        return "";
    }
}