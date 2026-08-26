class Solution {

    static int perfectSum(int[] arr, int target) {
        int n = arr.length;
        Integer[][] dp = new Integer[n + 1][target + 1];

        return solve(arr, n, target, dp);
    }

    static int solve(int[] arr, int n, int sum, Integer[][] dp) {

        // No elements left
        if (n == 0) {
            return sum == 0 ? 1 : 0;
        }

        // Already calculated
        if (dp[n][sum] != null) {
            return dp[n][sum];
        }

        // Don't take current element
        int notTake = solve(arr, n - 1, sum, dp);

        // Take current element
        int take = 0;
        if (arr[n - 1] <= sum) {
            take = solve(arr, n - 1, sum - arr[n - 1], dp);
        }

        return dp[n][sum] = take + notTake;
    }
}