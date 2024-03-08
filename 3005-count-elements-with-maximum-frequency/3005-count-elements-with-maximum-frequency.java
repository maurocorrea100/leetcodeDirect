class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] arr = new int[101]; int max = -1, count = 0; for(int el : nums) max = Math.max(max,++arr[el]); for(int el : arr) if(el==max) count= count+el; return count; // :) just kidding man
    }
}