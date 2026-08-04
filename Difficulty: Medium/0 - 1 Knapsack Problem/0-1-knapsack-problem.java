import java.util.Arrays;

class Solution {
    public int knapsack(int W, int val[], int wt[]) {
        int n = val.length;
        // Size columns to W + 1 so dp[index][W] is valid
        int[][] dp = new int[n][W + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        
        return rec(n - 1, W, val, wt, dp);
    }
    
    public int rec(int index, int remwt, int val[], int wt[], int[][] dp) {
        // Base Case: No items left or no capacity left
        if (index < 0 || remwt == 0) {
            return 0;
        }
            
        // Return cached result if already calculated
        if (dp[index][remwt] != -1)
            return dp[index][remwt];
            
        int pick = 0;
        // Only pick if the item fits in the remaining weight
        if (wt[index] <= remwt) {
            pick = rec(index - 1, remwt - wt[index], val, wt, dp) + val[index]; // Added dp
        }
        
        int notpick = rec(index - 1, remwt, val, wt, dp); // Added dp
        
        // Memoize and return the result
        return dp[index][remwt] = Math.max(pick, notpick);
    }
}
