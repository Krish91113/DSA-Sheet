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