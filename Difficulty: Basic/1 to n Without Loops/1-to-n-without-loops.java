class Solution {
    static void printTillN(int N) {
        // code here
        solve(1,N);
        return;
        
    }
    public static void solve(int i,int N){
        if(i>N) return;
        System.out.print(i+" ");
        solve(i+1,N);
        return;
    }
}