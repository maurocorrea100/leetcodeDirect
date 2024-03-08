class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] arr = new int[101];
        int max = -1;
        for(int el : nums){
            arr[el]++;
            max = Math.max(arr[el],max);
        }
        
        int count = 0;
        
        for(int el : arr) if(el==max) count= count+el;
        
        return count;
    }
}