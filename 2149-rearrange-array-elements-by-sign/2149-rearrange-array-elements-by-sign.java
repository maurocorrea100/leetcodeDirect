class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
                
        for(int el: nums){
           if(el>0) pos.add(el);
           else neg.add(el);
        }
        
        int index=0;
        for(int i = 0; i< nums.length; i+=2){
            nums[i] = pos.get(index);
            nums[i+1] = neg.get(index);
            index++;
        }
        return nums;
    }
}