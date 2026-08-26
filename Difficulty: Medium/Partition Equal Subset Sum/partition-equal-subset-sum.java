class Solution {
    static boolean equalPartition(int arr[]) {
        // code here
        int sum=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        
        if(sum%2!=0) return false;
        int s=sum/2;
        Boolean[][]dp=new Boolean[n+1][sum+1];
        return solve(arr,n,s,dp);
        
    }
    
    public static Boolean solve(int[] arr,int n,int s,Boolean[][]dp){
        if(s==0)
            return true;
            else if(n==0)
            return false;
            else if(dp[n][s]!=null)
            return dp[n][s];
            else if(arr[n-1]>s)
            return dp[n][s]=solve(arr,n-1,s,dp);
        else return dp[n][s]= (solve(arr,n-1,s-arr[n-1],dp)|| solve(arr,n-1,s,dp));


    }
}