class Solution {
    void printNos(int n) {
        // code here
        solve(n);
        
    }
    public void solve(int n){
        if(n<1) return;
       System.out.print(n+" ");
        solve(n-1);
    }
}