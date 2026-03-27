package BinarySearch.OnAnswer;

import java.util.Arrays;
import java.util.Scanner;

public class aggresiveCows {
    private static int aggCows(int nums[],int k){
        int ans=0,mind=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=1;j<nums.length;j++){
                mind=Math.min(mind,Math.abs(nums[i]-nums[j]));
                ans =Math.max(ans,mind);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int nums[] = new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        Arrays.sort(nums);
        int k =sc.nextInt();
        System.out.println(aggCows(nums,k));
    }
}
