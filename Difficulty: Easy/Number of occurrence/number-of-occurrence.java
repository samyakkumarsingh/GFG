class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        return solve(arr,target,0);
    }
    
    public static int solve(int [] arr,int target,int i){
        if(i==arr.length) return 0;
        if(arr[i]==target)
        return 1+solve(arr,target,i+1);
        return solve(arr,target,i+1);
    }   
} 
