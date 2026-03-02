// User function Template for Java
class Solution {
    // Function to remove all occurrences of the character from the string
    public void removeCharacter(StringBuilder s, char c) {
        // code here
         solve(s,c,0);
    }
    
    public void solve(StringBuilder s,char c,int i){
        if(i>=s.length()) return;
        if(s.charAt(i)==c){
            s.deleteCharAt(i);
            solve(s,c,i);
        }
        else{
        solve(s,c,i+1);
        }
        return ;
    }
}