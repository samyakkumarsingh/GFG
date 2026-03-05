class Solution {
    public int maxSubarraySum(int[] arr, int k) {

        int low = 0;
        int high = k - 1;

        int current = 0;

        for(int i = low; i <= high; i++){
            current += arr[i];
        }

        int max = current;

        while(high < arr.length - 1){
            low++;
            high++;
            current = current - arr[low - 1] + arr[high];
            max = Math.max(max, current);
        }

        return max;
    }
}