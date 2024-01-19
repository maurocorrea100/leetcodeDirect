class Solution {
  public int minFallingPathSum(int[][] matrix) {
    int n = matrix.length;

    int[] dp = new int[n];
    System.arraycopy(matrix[0], 0, dp, 0, n);

    for (int i = 1; i < n; i++) {
        int[] temp = new int[n];
        for (int j = 0; j < n; j++) {
            int minPrev = dp[j];
            if (j > 0) {
                minPrev = Math.min(minPrev, dp[j - 1]);
            }
            if (j < n - 1) {
                minPrev = Math.min(minPrev, dp[j + 1]);
            }
            temp[j] = matrix[i][j] + minPrev;
        }
        System.arraycopy(temp, 0, dp, 0, n);
    }

    int minSum = Integer.MAX_VALUE;
    for (int num : dp) {
        minSum = Math.min(minSum, num);
    }

    return minSum;
}

}