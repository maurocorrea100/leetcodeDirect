class Solution {
    public String maximumOddBinaryNumber(String s) {
         StringBuilder str = new StringBuilder(s);
        if(s.indexOf("1")==s.lastIndexOf("1")){
            int ind = str.indexOf("1");
            str.setCharAt(ind,'0');
            str.setCharAt(str.length()-1,'1');
        }else{
            str = new StringBuilder();
            int count = 0;
            for(int i = 0; i < s.length(); i++) if(s.charAt(i)=='1') count++;
            while(count>1){
                str.append(1);
                count--;
            }
            while(str.length()<s.length()-1){
                str.append(0);
            }
            str.append(1);
        }
          return str.toString();
    }
}