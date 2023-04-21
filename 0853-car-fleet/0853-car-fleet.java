class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
         int res = 0;
        int max = -1;
        
        for(int el : position){
            max = Math.max(el,max);
        }
        
       double[] timeArr = new double[max+1];
       for (int i = 0; i < position.length; i++)
        {
            timeArr[position[i]]= (double)(target - position[i]) / speed[i];
        }
        double prev = 0.0;
        for (int i = max; i >=0 ; i--)
        {
            double cur = timeArr[i];
            if (cur > prev)
            {
                prev = cur;
                res++;
            }
        }
        return res;
    }
}