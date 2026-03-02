class Solution {
    boolean isPalindrome(String s) {
        // code here
        return solve(s,0,s.length()-1);
    }
    
    public boolean solve(String s,int i,int j){
        if(i>=j) return true;
        if(s.charAt(i)==s.charAt(j))
        return solve(s,i+1,j-1);
        else return false;
    }
}