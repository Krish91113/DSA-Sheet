package DynamicProgramming.OneDDp;
import java.util.*;
public class frogJump {
    public static int countMin(int nums[], int n){
//        if(n== 0) return 0;
//        int left = countMin(nums,n-1) + Math.abs(nums[n] - nums[n-1]);
//        int right =Integer.MAX_VALUE;
//        if(n > 1){
//            right =countMin(nums,n-2) + Math.abs(nums[n]-nums[n-2]);
//        }
//        return Math.min(left,right);

        // Memoization
        int dp[] =new int[n+1];
        Arrays.fill(dp,-1);
        if(n== 0) return 0;
        if(dp[n] != -1) return dp[n];
        int left = countMin(nums,n-1) + Math.abs(nums[n] - nums[n-1]);
        int right =Integer.MAX_VALUE;
        if(n > 1){
            right =countMin(nums,n-2) + Math.abs(nums[n]-nums[n-2]);
        }
        return dp[n]= Math.min(left,right);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int nums[] =new int[n];
        for(int i= 0;i<n;i++){
            nums[i]=sc.nextInt();
        }

        System.out.println(countMin(nums,n-1));
    }
}
