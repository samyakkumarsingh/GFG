class Solution {
    static boolean isSubsetSum(int arr[], int sum) {
        // code here
        int n=arr.length;
        return solve(arr,sum,0);
        
    }
    
    public static boolean solve(int[] arr,int sum,int i){
        int n=arr.length;
        if(sum==0) return true;
        if(n==0) return false;
        if(i==n) return false;
        if(arr[i]>sum) return solve(arr,sum,i+1);
        return solve(arr,sum-arr[i],i+1)||solve(arr,sum,i+1);
    }
}