class Solution {
    public int numberOfSubarrays(int[] A, int k) {
              int res = 0, i = 0, j = 0, count = 0;
        while(j < A.length) {
            if (A[j] % 2 == 1) {
                k--;
                count = 0;
            }
            while (k == 0) {
                //k += A[i++] & 1     Replacing this line with the below two lines: 
                if(A[i] % 2 == 1) {
                    k++;   
                }
                count++;
                i++;
            }
            j++;
            res += count;
        }
        return res;
    }
}