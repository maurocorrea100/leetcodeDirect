class Solution {
    public int minimumRecolors(String blocks, int k) {
        int numsW=0, numsB=0;
        int operationCount = k;

        int i=0, j=0;
        while(j<blocks.length()){
          
           
            int length = j-i+1;
          
            if(j-i+1 <= k){
                if(blocks.charAt(j) == 'B'){
                    numsB++;
                }else{
                    numsW++;
                }
                j++;
            }else{
                if(blocks.charAt(i) == 'B'){
                    numsB--;
                }else{
                    numsW--;
                }
                i++;
            }
          if(length == k){
                 operationCount = Math.min(operationCount, numsW);
            }
            
        }
        return operationCount;
    }
}