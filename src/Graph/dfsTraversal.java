package Graph;

import java.util.*;

public class dfsTraversal {

    public static void dfs(
            int node,
            boolean[] vis,
            ArrayList<ArrayList<Integer>> adj,
            ArrayList<Integer> ls) {

        // Mark current node visited
        vis[node] = true;

        // Add current node to answer
        ls.add(node);

        // Visit all neighbours
        for(int n : adj.get(node)) {

            if(!vis[n]) {
                dfs(n, vis, adj, ls);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int V = sc.nextInt();
        int E = sc.nextInt();

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        // Since nodes are 1 to V
        for(int i = 0; i <= V; i++) {
            adj.add(new ArrayList<>());
        }

        // Build undirected graph
        for(int i = 0; i < E; i++) {

            int u = sc.nextInt();
            int v = sc.nextInt();

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        int node = 1;

        boolean[] vis = new boolean[V + 1];

        ArrayList<Integer> ls = new ArrayList<>();

        dfs(node, vis, adj, ls);

        for(int i = 0; i < ls.size(); i++) {
            System.out.print(ls.get(i) + " ");
        }
    }
}