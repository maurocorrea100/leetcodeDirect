class Solution {
    public int[] sortedSquares(int[] nums) {


        if(nums[0]>0 && nums[nums.length-1]>0)
            for(int i = 0; i < nums.length; i++) nums[i] = nums[i]*nums[i];
        else if(nums[0]<0 && nums[nums.length-1]<0) {
            int[] arr = new int[nums.length];
            for (int i = nums.length - 1,  j = 0; i >= 0; i--, j++) arr[j] = nums[i]*nums[i];
            return arr;
        }
        else{
            //find interInd
            int interInd = 0;
            for(int i = 0; i < nums.length-1; i++){
                int j = i+1;
                if(nums[i]<0 && nums[j]>=0) interInd = i;
            }
            ArrayList<Integer> list = new ArrayList<>();

            int lefti = interInd;
            int righti = lefti+1;
            while(lefti>=0 && righti<nums.length){
                int lSq = nums[lefti]*nums[lefti];
                int rSq = nums[righti]*nums[righti];
                if(lSq > rSq) {
                    list.add(rSq);
                    righti++;
                }else{
                    list.add(lSq);
                    lefti--;
                }
            }
            while(lefti>=0){
                list.add(nums[lefti]*nums[lefti]);
                lefti--;
            }
            while(righti<nums.length){
                list.add(nums[righti]*nums[righti]);
                righti++;
            }
            int[] array = new int[list.size()];
            for(int i = 0; i < list.size(); i++) array[i] = list.get(i);
            return array;
        }
        return nums;
    }
}