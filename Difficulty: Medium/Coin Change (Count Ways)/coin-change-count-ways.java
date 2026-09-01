class Solution {
    public int count(int coins[], int sum) {
        int n = coins.length;
        Integer[][] dp = new Integer[n + 1][sum + 1];

        return solve(coins, n, sum, dp);
    }

    public int solve(int[] coins, int n, int sum, Integer[][] dp) {

        // Base cases
        if (sum == 0)
            return 1;

        if (n == 0)
            return 0;

        // Already calculated
        if (dp[n][sum] != null)
            return dp[n][sum];

        // If current coin is greater than sum, cannot take it
        if (coins[n - 1] > sum) {
            dp[n][sum] = solve(coins, n - 1, sum, dp);
        } 
        else {
            // Take the coin -> n remains same because coin can be reused
            // Don't take the coin -> move to n-1
            dp[n][sum] = solve(coins, n, sum - coins[n - 1], dp)
                       + solve(coins, n - 1, sum, dp);
        }

        return dp[n][sum];
    }
}