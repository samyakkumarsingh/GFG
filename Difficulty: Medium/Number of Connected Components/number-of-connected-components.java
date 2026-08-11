import java.util.*;

class Solution {

    public int countConnected(int V, ArrayList<ArrayList<Integer>> edges) {

        // Create adjacency list
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        // Convert edge list to adjacency list
        for (ArrayList<Integer> edge : edges) {

            int u = edge.get(0);
            int v = edge.get(1);

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        boolean[] visited = new boolean[V];

        int count = 0;

        for (int i = 0; i < V; i++) {

            if (!visited[i]) {

                count++;

                dfs(i, graph, visited);
            }
        }

        return count;
    }

    private void dfs(int node,
                     ArrayList<ArrayList<Integer>> graph,
                     boolean[] visited) {

        visited[node] = true;

        for (int neighbour : graph.get(node)) {

            if (!visited[neighbour]) {
                dfs(neighbour, graph, visited);
            }
        }
    }
}