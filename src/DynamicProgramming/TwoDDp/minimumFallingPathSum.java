package DynamicProgramming.TwoDDp;
import java.util.*;
public class minimumFallingPathSum {
    public static int solve(int i, int j, int m, int n, int matrix[][]){
        if (i >= m || j >= n || i < 0 || j < 0)  return 1_000_000_000;
        if(i==m-1 ) return matrix[i][j];

        int bottom=matrix[i][j]+solve(i+1,j,m,n,matrix);
        int bottomR=matrix[i][j]+solve(i+1,j+1,m,n,matrix);
        int bottomL=matrix[i][j]+solve(i+1,j-1,m,n,matrix);
        return Math.min(bottom,Math.min(bottomL,bottomR));
    }
    public static int minFallingPathSum(int matrix[][]){
        int m=matrix.length;
        int n=matrix[0].length;
        int ans=Integer.MAX_VALUE;
        for(int j=0;j<n;j++){
            ans =Math.min(ans,solve(0,j,m,n,matrix));
        }
        return ans;
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
        System.out.println(minFallingPathSum(matrix));
    }
}
