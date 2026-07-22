<<<<<<< HEAD
//package DynamicProgramming.OneDDP;
//
//import java.util.*;
//
//public class houseRobber2 {
//
//    public static int max(int ind, int nums[], int dp[]) {
//        if (ind == 0)
//            return nums[ind];
//
//        if (ind < 0)
//            return 0;
//
//        if (dp[ind] != -1)
//            return dp[ind];
//
//        int pick = nums[ind] + max(ind - 2, nums, dp);
//        int unpick = max(ind - 1, nums, dp);
//
//        return dp[ind] = Math.max(pick, unpick);
//    }
//
////    public static int rob(int nums[]) {
////
////        int n = nums.length;
////
////        return Math.max(max());
////    }
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//
//        int nums[] = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            nums[i] = sc.nextInt();
//        }
//
//        System.out.println(rob(nums));
//    }
//}
=======
package DynamicProgramming.OneDDp;

import java.util.Scanner;

public class houseRobber2 {
    public static int solve(int nums[]){
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
    public static int rob(int nums[]){
        int n =nums.length;
        if(n == 0) return 0;
        if(n == 1) return nums[0];
        int arr1[] =new int[n-1];
        int arr2[] =new int[n-1];
        for(int i=0;i<n;i++){
            if(i!= 0) arr1[i-1]=nums[i];
            if(i!=n-1) arr2[i]=nums[i];
        }
        return Math.max(solve(arr1),solve(arr2));
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
>>>>>>> 729d194c8bb6efbab3f182de387be7bff374462e
