class Solution 
{
    public int[][] adjToMat(ArrayList<ArrayList<Integer>> adj) 
    {
        int n = adj.size();
        int[][] mat = new int[n][n];

        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat.length; j++){
                if(adj.get(i).contains(j))
                mat[i][j]=1;
            }
        }
        return mat;
    }
}