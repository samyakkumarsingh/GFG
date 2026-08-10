class Solution { 
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) { 
        int[] visited = new int[adj.size()]; 
        Arrays.fill(visited, 0); 
        ArrayList<Integer> ans = new ArrayList<>(); 
        
        // Start DFS from the first node if the graph is not empty
        if (adj.size() > 0) {
            solve(adj, visited, ans, 0); 
        }
        return ans; 
    } 
    
    public ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> adj, int[] visited, ArrayList<Integer> ans, int node){ 
        visited[node] = 1; 
        ans.add(node); 
        for (int neigh : adj.get(node)) { 
            if (visited[neigh] == 0) {
                solve(adj, visited, ans, neigh); 
            }
        } 
        return ans; 
    } 
}
