class Solution {
    public int[] findErrorNums(int[] nums) {
     Arrays.sort(nums);;
      int rep =0, repIndex=0;
      for(int i = 0; i < nums.length-1; i++){
          if(nums[i]==nums[i+1]){
              rep = nums[i];
              repIndex = i;
              break;
          }
      }
      
      int missing = 0;
      
      for(int i = 0; i <= repIndex; i++){
          if(i+1 != nums[i]) {
              missing = i+1;
              return new int[]{rep,missing};
          }
      }
      
      for(int i = repIndex+1; i<nums.length; i++){
          if(i != nums[i]){
              missing = i;
              return new int[]{rep,missing}; 
          }
      }
      
      if(missing==0) return new int[]{rep,nums.length};
      return null;
    }
}