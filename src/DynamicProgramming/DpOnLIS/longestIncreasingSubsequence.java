package DynamicProgramming.DpOnLIS;
import java.util.*;
public class longestIncreasingSubsequence {
    public static int solve(int i, int p, int nums[], int dp[][]){
        if(i>=nums.length) return 0;
        if(dp[i][p+1]!=-1) return dp[i][p+1];
        int take=0;
        if(p==-1 || nums[p]<nums[i]){
            take = 1+solve(i+1,i,nums,dp);
        }
        int skip = solve(i+1,p,nums,dp);
        return dp[i][p+1]=Math.max(take,skip);
    }
    public static int lcs(int nums[]){
        int n= nums.length;
        int dp[][]=new int[n+1][n+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        return solve(0,-1,nums,dp);
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int nums[] = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(lcs(nums));
    }
}
