class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int[][] nums = new int[position.length][2];
        for(int i = 0; i < position.length; i++){
            
            nums[i][0] = position[i];
            nums[i][1] = speed[i];
        }
        Arrays.sort(nums, Comparator.comparing(a -> -a[0]));
        double cur = 0;
        int res = 0;
        for(int i = 0; i < nums.length; i++){
            double n = (target-nums[i][0])/(double)nums[i][1];
            if(cur<n){
                res++;
                cur=n;
            }
            
        }
        return res;
    }
}