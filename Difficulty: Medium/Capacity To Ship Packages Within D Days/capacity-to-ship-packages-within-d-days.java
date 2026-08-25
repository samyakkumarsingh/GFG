class Solution {
    public int leastWeightCapacity(ArrayList<Integer> arr, int d) {
        int n = arr.size();
        int low = Collections.max(arr);
        int high = 0;
        for (int w : arr) high += w;
        int ans = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isPossible(mid, arr, d)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public boolean isPossible(int capacity, ArrayList<Integer> arr, int d) {
        int days = 1;
        int sum = 0;
        for (int w : arr) {
            if (sum + w > capacity) {
                days++;
                sum = w;
            } else {
                sum += w;
            }
        }
        return days <= d;
    }
}
