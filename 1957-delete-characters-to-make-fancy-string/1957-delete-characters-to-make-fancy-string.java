class Solution {
    public String makeFancyString(String s) {
       StringBuilder res = new StringBuilder();
       res.append(s.charAt(0));
       int counter = 1;
       for(int i = 1; i < s.length(); i++){
            char letter = s.charAt(i);
            if(res.charAt(res.length()-1)==letter) {
                if(counter == 2) continue;
                res.append(letter);
                counter++;
            }else{
                res.append(letter);
                counter = 1;
            }
        }


        return res.toString();
    }
}