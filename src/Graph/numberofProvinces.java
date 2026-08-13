package Graph;
import java.util.*;
public class numberofProvinces {
    class Solution {
        public static void bfs(int i, int adj[][], boolean vis[]){
            vis[i]=true;
            int n=adj.length;
            Queue<Integer> q=new LinkedList<>();
            q.add(i);
            while(q.size()>0){
                int front=q.remove();
                for(int j=0;j<n;j++){
                    if(adj[front][j]==1 && vis[j]==false){
                        q.add(j);
                        vis[j]=true;
                    }
                }
            }
        }
        public int findCircleNum(int[][] adj) {
            int n=adj.length;
            int c=0;
            boolean visited[] = new boolean[n];
            for(int i=0;i<n;i++){
                if(!visited[i]){
                    bfs(i,adj,visited);
                    c++;
                }
            }
            return c;
        }
    }
    public static void main(String[] args) {

    }
}
