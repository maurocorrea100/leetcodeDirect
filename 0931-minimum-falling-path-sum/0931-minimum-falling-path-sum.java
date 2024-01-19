class Solution {
public int minFallingPathSum(int[][] matrix) {
    int n = matrix.length;

    int[] dp = matrix[0].clone(); // Initialize with the first row

    for (int i = 1; i < n; i++) {
        int[] temp = new int[n];
        temp[0] = matrix[i][0] + Math.min(dp[0], dp[1]);
        temp[n - 1] = matrix[i][n - 1] + Math.min(dp[n - 1], dp[n - 2]);

        for (int j = 1; j < n - 1; j++) {
            temp[j] = matrix[i][j] + Math.min(dp[j - 1], Math.min(dp[j], dp[j + 1]));
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