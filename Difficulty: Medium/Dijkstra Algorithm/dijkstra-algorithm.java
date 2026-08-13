import java.util.*;
class Solution {
    static class Pair {
        int node;
        int weight;
        Pair(int node, int weight) {
            this.node = node;
            this.weight = weight;
        }
    }
    public ArrayList<Integer> dijkstra(int V, int[][] edges, int src) {
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            int w = edges[i][2];
            adj.get(u).add(new Pair(v, w));
            adj.get(v).add(new Pair(u, w));
        }
        ArrayList<Integer> dist = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            dist.add(Integer.MAX_VALUE);
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(a.weight, b.weight)
        );
        dist.set(src, 0);
        pq.offer(new Pair(src, 0));
        while (!pq.isEmpty()) {
            Pair current = pq.poll();
            int node = current.node;
            int d1 = current.weight;
            if (dist.get(node) < d1) {
                continue;
            }
            for (Pair neigh : adj.get(node)) {
                int dest = neigh.node;
                int d2 = neigh.weight;

                if (dist.get(dest) > dist.get(node) + d2) {
                    dist.set(dest, dist.get(node) + d2);
                    pq.offer(new Pair(dest, dist.get(dest)));
                }
            }
        }

        return dist;
    }
}