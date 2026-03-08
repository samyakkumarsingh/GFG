class Solution {
    public ArrayList<Integer> findMajority(int[] arr) {
        // Code here
        int n=arr.length;
        int count1=0;
        int count2=0;
        
        int maj1=0;
        int maj2=0;
        for(int i=0;i<n;i++){
            if(arr[i]==maj1){
                count1++;
            }
            else if(arr[i]==maj2){
                count2++;
            }
            else if(count1==0){
                maj1=arr[i];
                count1=1;
            }
            else if(count2==0){
                maj2=arr[i];
                count2=1;
            }
            else{
                count1--;
                count2--;
            }
        }
        ArrayList<Integer> result=new ArrayList<>();
        int  freq1=0;
        int  freq2=0;
        
        for(int num: arr){
            if(num==maj1)
                freq1++;
            else if(num==maj2)
                freq2++;
        }
        
        if(freq1>(n/3))
            result.add(maj1);
            
        if(freq2>(n/3))
        result.add(maj2);
        Collections.sort(result);
        
        return result;
        
    }
}
