
class Solution {
    public int minDifference(int arr[]) {
        int n = arr.length;

        // Calculate total sum
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        // dp[i][sum] = can we make 'sum' using first i elements?
        boolean[][] dp = new boolean[n + 1][totalSum + 1];

        // Sum 0 is always possible
        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }

        // Build DP table
        for (int i = 1; i <= n; i++) {
            for (int sum = 1; sum <= totalSum; sum++) {

                // Don't take current element
                boolean notTake = dp[i - 1][sum];

                // Take current element
                boolean take = false;

                if (arr[i - 1] <= sum) {
                    take = dp[i - 1][sum - arr[i - 1]];
                }

                dp[i][sum] = take || notTake;
            }
        }

        int minDiff = Integer.MAX_VALUE;

        // Check only sums up to totalSum / 2
        for (int s = 0; s <= totalSum / 2; s++) {

            if (dp[n][s]) {
                int diff = totalSum - 2 * s;
                minDiff = Math.min(minDiff, diff);
            }
        }

        return minDiff;
    }
}