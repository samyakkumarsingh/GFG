class Solution {
    ArrayList<String> res=new ArrayList<>();;
    public ArrayList<String> binstr(int n) {
        // code here
        StringBuilder sb=new StringBuilder();
        solve(0,sb,n);
        return  res;
    }
    
    public void solve(int i,StringBuilder sb,int n){
        if(sb.length()==n){
        res.add(sb.toString());
            return;
        }
        
        sb.append('0');
        solve(i+1,sb,n);
        sb.deleteCharAt(sb.length()-1);
        
        sb.append('1');
        solve(i+1,sb,n);
        sb.deleteCharAt(sb.length()-1);
        
        
        return ;
    }
}
