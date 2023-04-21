class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        double[][] nums = new double[position.length][2];
        for(int i = 0; i < position.length; i++){
            nums[i][0] = position[i];
            nums[i][1] = (target-position[i])/(double)speed[i];
        }
        Arrays.sort(nums, Comparator.comparing(a -> -a[0]));
        double cur = 0;
        int res = 0;
        double n = 0.0;
        for(int i = 0; i < nums.length; i++){
            n = nums[i][1];
            if(cur<n){
                res++;
                cur=n;
            }
            
        }
        return res;
    }
}