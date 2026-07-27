package DynamicProgramming.TwoDDp;
import java.util.*;
public class uniquePath2 {
//    public static int solve(int i, int j, int matrix[][], int m, int n, int dp[][]){
//        if( i>=m || j>=n ) return 0;
//        if( matrix[i][j]==1 ) return 0;
//        if(i==m-1 && j==n-1) return 1;
//        if(dp[i][j]!=-1) return dp[i][j];
//        int right=solve(i,j+1,matrix,m,n,dp);
//        int down=solve(i+1,j,matrix,m,n,dp);
//        dp[i][j]=right+down;
//        return right+down;
//    }
//    public static int uniquePathsWithObstacles(int matrix[][]){
//        int m=matrix.length;
//        int n=matrix[0].length;
//        int dp[][] = new int[m+1][n+1];
//        for(int i=0;i<dp.length;i++){
//            Arrays.fill(dp[i], -1);
//        }
//        return solve(0,0, matrix,m,n,dp);
//    }
public static int uniquePathsWithObstacles(int[][] matrix) {
    int m = matrix.length;
    int n = matrix[0].length;

    int[][] dp = new int[m][n];

    for (int i = m - 1; i >= 0; i--) {
        for (int j = n - 1; j >= 0; j--) {

            // obstacle
            if (matrix[i][j] == 1) {
                dp[i][j] = 0;
            }

            // destination
            else if (i == m - 1 && j == n - 1) {
                dp[i][j] = 1;
            }

            else {
                int right = 0;
                int down = 0;

                if (j + 1 < n) {
                    right = dp[i][j + 1];
                }

                if (i + 1 < m) {
                    down = dp[i + 1][j];
                }

                dp[i][j] = right + down;
            }
        }
    }

    return dp[0][0];
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
