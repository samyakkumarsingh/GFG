class Solution {
    
    public boolean possible(int[] arr,int k,int mid){
        int cows=1;
        int n=arr.length;
        int prev=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]-prev>=mid){
                cows++;
                prev=arr[i];
            }
        }
        if(cows>=k) return true;
        return false;
    }
    
    public int aggressiveCows(int[] arr, int k) {
        // code here
        Arrays.sort(arr);
        int n=arr.length;
        int low=1;
        int high=arr[n-1]-arr[0];
        int ans=high;
        
        while(low<=high){
            int mid=(low+high)/2;
            if(possible(arr,k,mid)==true){
                ans=mid;
                low=mid+1;
            }
            else high=mid-1;
        }
        return ans;
        
    }
}