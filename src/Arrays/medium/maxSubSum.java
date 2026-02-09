package Arrays.medium;

import java.util.Scanner;

public class maxSubSum {
    private static int maxSubArraySum(int nums[]){
        int currSum=nums[0],maxSum=nums[0];
        for(int i=1;i<nums.length;i++){
            currSum =Math.max(nums[i], currSum + nums[i]);
            maxSum=Math.max(currSum,maxSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n  = sc.nextInt();
        int nums[] = new int[n];
        for(int i =0;i<nums.length;i++){
            nums[i] =sc.nextInt();
        }
        System.out.println(maxSubArraySum(nums));
    }
}
