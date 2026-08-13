package Graph;

import java.util.*;

public class bfsTraversal {

    public static ArrayList<Integer> bfs(
            ArrayList<ArrayList<Integer>> adj,
            int v) {

        ArrayList<Integer> bfs = new ArrayList<>();

        Queue<Integer> q = new LinkedList<>();

        boolean[] vis = new boolean[v];

        q.add(0);
        vis[0] = true;

        while(!q.isEmpty()) {

            int node = q.poll();

            bfs.add(node);

            for(int n : adj.get(node)) {

                if(!vis[n]) {

                    vis[n] = true;
                    q.add(n);
                }
            }
        }

        return bfs;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int V = sc.nextInt();
        int E = sc.nextInt();

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        for(int i = 0; i < E; i++) {

            int u = sc.nextInt();
            int v = sc.nextInt();

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        ArrayList<Integer> result = bfs(adj, V);

        System.out.println("BFS: " + result);
    }
}