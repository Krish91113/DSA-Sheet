package DynamicProgramming.DpOnSubsequence;
import java.util.*;
public class subsetSumEqualsTarget {
    public static boolean solve(int i, int target,int nums[],int dp[][]){
        if(i == nums.length-1) return nums[nums.length-1]==target;
        if(target == 0) return true;
        if(dp[i][target]!=-1) return dp[i][target]==1;
        boolean ntake = solve(i+1,target,nums,dp);
        boolean take=false;
        if(target>=nums[i]){
            take = solve(i+1,target-nums[i],nums,dp);
        }
        dp[i][target]=(ntake || take) ? 1:0;
        return ntake || take;
    }
    public static boolean isSubsetSum(int nums[], int target){
        int dp[][]=new int[nums.length][target+1];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(0,target,nums,dp);
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int target =sc.nextInt();
        System.out.println(isSubsetSum(nums,target));
    }
}
