class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int[] arr = new int[words.length];
        boolean[] isVowel = new boolean[words.length];
        int count = 0, index = 0;
        for(String el: words){
            if((el.charAt(0)=='a' || el.charAt(0)=='e' || el.charAt(0)=='o'
                    || el.charAt(0)=='i'  || el.charAt(0)=='u')
                    && (el.charAt(el.length()-1)=='a' || el.charAt(el.length()-1)=='e' || el.charAt(el.length()-1)=='o'
                    || el.charAt(el.length()-1)=='i'  || el.charAt(el.length()-1)=='u')) {
                count++;
                isVowel[index]=true;
            }
            arr[index] = count;
            index++;
        }
        index = 0;
        int[] result = new int[queries.length];
        for (int[] range : queries){
            if(range[0]==range[1]){
                if(range[0]==0) result[index] = arr[0];
                else result[index] = arr[range[1]]-arr[range[1]-1];
            }else{
                if((!isVowel[range[0]] && !isVowel[range[1]]) || (!isVowel[range[0]] && isVowel[range[1]])){
                    result[index] = arr[range[1]]-arr[range[0]];
                }else{
                    result[index] = arr[range[1]]-arr[range[0]]+1;
                }
            }
            index++;
        }

        return result;
    }
}