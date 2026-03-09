class Solution {
    void nextPermutation(int[] arr) {
        // code here
        int n=arr.length;
        int index=-1;
        for(int i=n-1;i>0;i--){
            if(arr[i-1]<arr[i]){
                index=i-1;
                break;
            }
        }
            if(index!=-1){
            int swap_index=index;
            for(int j=n-1;j>=index;j--){
                if(arr[j]>arr[index]){
                    swap(arr,j,index);
                    break;
                }
            }
        }
        reverse(arr,index+1,n-1);
    }
    
    void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    
    void reverse(int[] arr,int start,int end){
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
}
