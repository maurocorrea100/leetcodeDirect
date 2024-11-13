class Solution {
    public String makeFancyString(String s) {
        if(s.length()<=2) return s;
        
        StringBuilder res = new StringBuilder();
        res.append(s.charAt(0));
        int counter = 1;
        for(int i = 1; i < s.length(); i++){
            if(res.charAt(res.length()-1)==s.charAt(i)) {
                if(counter == 2) continue;
                res.append(s.charAt(i));
                counter++;
            }else{
                res.append(s.charAt(i));
                counter = 1;
            }
        }
        
        return res.toString();
    }
}