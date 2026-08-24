class Solution {
	public int aggressiveCows(int[] arr, int k) {
		// code here
		int n=arr.length;
		Arrays.sort(arr);
		int low = 1;
		int high = arr[n-1]-arr[0];
		int ans = 0;
		while (low <= high) {
			int mid = low + (high - low)/2;
			if (isPossible(mid, arr, k)) {
				ans = mid;
				low = mid + 1;
			}
			else
				high = mid - 1;
		}
		return ans;
	}
	
	public boolean isPossible(int mid, int[] arr, int k) {
		int n = arr.length;
		int cows = 1;
		int prev = arr[0];
		for (int i = 1; i<n; i++) {
			if (arr[i]-prev >= mid) {
				cows++;
				prev = arr[i];
			}
		}
		
		if (cows >= k)
			return true; else return false;
	}
}
