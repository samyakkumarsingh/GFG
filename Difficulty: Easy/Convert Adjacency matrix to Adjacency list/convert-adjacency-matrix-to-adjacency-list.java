class Solution 
{
    public ArrayList<ArrayList<Integer>> matToAdj(int[][] mat) 
    {
        // code here
     int n=mat.length;
     ArrayList<ArrayList<Integer>> adjlist=new ArrayList<>();
     for(int i=0;i<n;i++){
         adjlist.add(new ArrayList<>());
     }
     for(int i=0;i<n;i++){
         for(int j=0;j<n;j++){
             if(mat[i][j]==1){
                 adjlist.get(i).add(j);
             }
         }
     }
     return adjlist;
    }
}