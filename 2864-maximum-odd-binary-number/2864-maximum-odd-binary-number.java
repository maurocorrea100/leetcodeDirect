class Solution {
    public String maximumOddBinaryNumber(String s) {
        int[] nums = new int[s.length()];
        StringBuilder str = new StringBuilder(s);
        if(s.indexOf("1")==s.lastIndexOf("1")){
            int ind = str.indexOf("1");
            str.setCharAt(ind,'0');
            str.setCharAt(str.length()-1,'1');
          //  return str.toString();
        }else{
             str = new StringBuilder();
            int count = 0;
            for(int i = 0; i < s.length(); i++) if(s.charAt(i)=='1') count++;
            for(int i = 0; i < count-1; i++){
                nums[i] = 1;
            }
            nums[nums.length-1] = 1;
            for(int el : nums) str.append(el);
        }
          return str.toString();
    }
}