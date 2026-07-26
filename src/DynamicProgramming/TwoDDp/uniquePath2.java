package DynamicProgramming.TwoDDp;
import java.util.*;
public class uniquePath2 {
    public static int solve(int i, int j, int matrix[][], int m, int n, int dp[][]){
        if( i>=m || j>=n ) return 0;
        if( matrix[i][j]==1 ) return 0;
        if(i==m-1 && j==n-1) return 1;
        if(dp[i][j]!=-1) return dp[i][j];
        int right=solve(i,j+1,matrix,m,n,dp);
        int down=solve(i+1,j,matrix,m,n,dp);
        dp[i][j]=right+down;
        return right+down;
    }
    public static int uniquePathsWithObstacles(int matrix[][]){
        int m=matrix.length;
        int n=matrix[0].length;
        int dp[][] = new int[m+1][n+1];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i], -1);
        }
        return solve(0,0, matrix,m,n,dp);
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
        System.out.println(uniquePathsWithObstacles(matrix));
    }
}
