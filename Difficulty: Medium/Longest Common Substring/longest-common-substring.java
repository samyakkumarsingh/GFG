class Solution {
	int ans = 0;
	
	public int longCommSubstr(String s1, String s2) {
		char[] str1 = s1.toCharArray();
		char[] str2 = s2.toCharArray();
		
		int n = str1.length;
		int m = str2.length;
		
		int[][] dp = new int[n + 1][m + 1];
		
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= m; j++) {
				dp[i][j] = -1;
			}
		}
		
		solve(str1, str2, n, m, dp);
		
		return ans;
	}
	
	public int solve(char[] str1, char[] str2, int n, int m, int[][] dp) {
		
		if (n == 0 || m == 0) {
			return 0;
		}
		
		if (dp[n][m] != -1) {
			return dp[n][m];
		}
		
		if (str1[n - 1] == str2[m - 1]) {
			dp[n][m] = 1 + solve(str1, str2, n - 1, m - 1, dp);
			ans = Math.max(ans, dp[n][m]);
		} else {
			dp[n][m] = 0;
		}
		
		solve(str1, str2, n - 1, m, dp);
		solve(str1, str2, n, m - 1, dp);
		
		return dp[n][m];
	}
}
