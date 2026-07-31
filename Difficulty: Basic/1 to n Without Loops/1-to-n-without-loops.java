class Solution {
    static void printTillN(int N) {
        // code here
        solve(N);
        return;
        
    }
    public static void solve(int n){
        if(n<1) return;
        solve(n-1);
       System.out.print(n+" ");
        
    }
}