package DynamicProgramming.OneDDP;
import java.util.*;
public class houseRobber {
   // recursive + memoiation
//    public static int max(int ind, int nums[], int dp[]){
//        if(ind == 0) return nums[ind];
//        if(ind < 0) return 0;
//        if(dp[ind]!=-1) return dp[ind];
//        int pick=nums[ind]+max(ind-2,nums,dp);
//        int unpick=0+max(ind-1,nums,dp);
//        return dp[ind]=Math.max(pick,unpick);
//    }
//    public static int rob(int nums[]){
//        int n=nums.length;
//        int dp[]=new int[n+1];
//        Arrays.fill(dp,-1);
//        return max(n-1,nums,dp);
//    }

    public static int rob(int nums[]){
        int n=nums.length;
        int dp[]=new int[n+1];
        dp[0]=nums[0];
        for(int i=1;i<n;i++){
            int take = nums[i];
            if(i>1) take+=dp[i-2];
            int nottake=0+dp[i-1];
            dp[i]=Math.max(take,nottake);
        }
        return dp[n-1];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int nums[] =new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(rob(nums));
    }
}
