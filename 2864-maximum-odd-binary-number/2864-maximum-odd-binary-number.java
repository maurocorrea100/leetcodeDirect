class Solution {
    public String maximumOddBinaryNumber(String s) {
        int[] nums = new int[s.length()];
        StringBuilder str = new StringBuilder(s);
        if(s.indexOf("1")==s.lastIndexOf("1")){
            int ind = str.indexOf("1");
            str.setCharAt(ind,'0');
            str.setCharAt(str.length()-1,'1');
        }else{
            str = new StringBuilder();
           for(int i = 0; i < nums.length;i++) if(s.charAt(i)=='1') nums[i] = 1;
           Arrays.sort(nums);
           for(int i = nums.length-2; i >=0; i--) str.append(nums[i]);
           str.append(1);
        }
          return str.toString();
    }
}