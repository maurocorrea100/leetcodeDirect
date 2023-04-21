class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
    int[][] nums = new int[position.length][2];
        for(int i = 0; i < position.length; i++){
            nums[i][0] = position[i];
            nums[i][1] = speed[i];
        }
        Arrays.sort(nums, Comparator.comparing(a -> -a[0]));
        Arrays.stream(nums).forEach(a -> System.out.println(Arrays.toString(a)));
        double [] els = new double[position.length];
        for(int i = 0; i < nums.length; i++) {
            double time = (double)(target-nums[i][0])/(double)nums[i][1];
            //time = Math.ceil(time);
            els[i] = time;
        }
        System.out.println(Arrays.toString(els));

        Stack<Double> st = new Stack<>();
        for(double el:els){
            if(st.isEmpty() || st.peek()<el) st.push(el);
        }
        System.out.println("Stack: " + st);
        return st.size();
    }
}