package DynamicProgramming.DpOnSubsequence;
import java.util.*;
public class countSubsetWithSumk {
    public static int solve(int i,int arr[], int k, int dp[][]){
        if(k == 0) return 1;
        if(i>=arr.length) return 0;
        if(dp[i][k]!=-1) return dp[i][k];
        int ntake=solve(i+1,arr,k,dp);
        int take=0;
        if(arr[i]<=k){
            take=solve(i+1,arr,k-arr[i],dp);
        }
        return dp[i][k]=take+ntake;
    }
    public static int perfectSum(int[] arr, int K) {
        int dp[][]=new int[arr.length][K+1];
        for(int i=0;i<arr.length;i++){
            Arrays.fill(dp[i], -1);
        }
        return solve(0,arr,K,dp);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int K =sc.nextInt();
        System.out.println(perfectSum(nums,K));
    }
}
