

class Solution {
    int[][] dp;

    public int knapsack(int W, int val[], int wt[]) {
        int n = val.length;
        dp = new int[1002][1002];

        // Change i < n to i <= n
        for(int i = 0; i <= n; i++) {
            Arrays.fill(dp[i], -1);
        }

        return solve(W, val, wt, n);
    }

    public int solve(int W, int[] val, int[] wt, int n) {
        if (W == 0 || n == 0) {
            return 0;
        }

        if (dp[n][W] != -1) {
            return dp[n][W];
        }

        if (wt[n-1] <= W) {
            return dp[n][W] = Math.max(
                val[n-1] + solve(W - wt[n-1], val, wt, n-1), 
                solve(W, val, wt, n-1)
            );
        } else {
            return dp[n][W] = solve(W, val, wt, n-1);
        }
    }
}