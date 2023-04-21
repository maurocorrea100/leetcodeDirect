class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int[][] nums = new int[position.length][2];
        for(int i = 0; i < position.length; i++){
            nums[i][0] = position[i];
            nums[i][1] = speed[i];
        }
        Arrays.sort(nums, Comparator.comparing(a -> -a[0]));
        Stack<Double> st = new Stack<>();
        for(int i = 0; i < nums.length; i++){
            double n = (target-nums[i][0])/(double)nums[i][1];
            if(st.isEmpty() || st.peek()<n) st.push(n);
        }
        System.out.println(st);
        return st.size();
    }
}