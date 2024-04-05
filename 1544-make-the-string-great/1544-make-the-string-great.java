class Solution {
    public String makeGood(String s) {
        StringBuilder el = new StringBuilder(s);
        boolean found = true;
        while(found){
            found = false;
            for(int i = 0; i < el.length()-1; i++){
                int j = i+1;
                if(el.charAt(i) - el.charAt(j) == 32 || el.charAt(i) - el.charAt(j) == -32 ){
                    el.deleteCharAt(i);
                    el.deleteCharAt(j-1);
                    found = true;
                }
            }
        }
        return el.toString();
    }
}