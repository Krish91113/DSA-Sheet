package DynamicProgramming.TwoDDp;
import java.util.*;
public class minPathSum {
        public static int solve(int i,int j,int m,int n,int grid[][], int dp[][]){
            if(i>=m || j>=n) return 1_000_000_000;
            if(i==m-1 && j==n-1) return grid[i][j];
            if(dp[i][j]!=-1) return dp[i][j];
            int right=grid[i][j]+solve(i,j+1,m,n,grid,dp);
            int down=grid[i][j]+solve(i+1,j,m,n,grid,dp);
            return dp[i][j]=Math.min(right,down);
        }
        public static int minPathSums(int[][] grid) {
            int m=grid.length;
            int n=grid[0].length;
            int dp[][] = new int[m][n];
            for (int[] row : dp) {
                Arrays.fill(row, -1);
            }
            return solve(0,0,m,n,grid,dp);
        }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int matrix[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println(minPathSums(matrix));
    }
}
