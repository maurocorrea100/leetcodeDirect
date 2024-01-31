class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
         Stack<int[]> st = new Stack<>();
        int[] arr = new int[temperatures.length];
        for(int i = 0; i < temperatures.length; i++){
            while(!st.isEmpty() && temperatures[i] > st.peek()[1]){
                int[] pair = st.pop();
                int index= pair[0];
                arr[index] = i-index;
            }
            st.push(new int[]{i,temperatures[i]});
        }
      return arr;
    }
}