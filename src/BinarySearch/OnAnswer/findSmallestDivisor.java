package BinarySearch.OnAnswer;

import java.util.Scanner;

public class findSmallestDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int nums[] = new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        int limit =sc.nextInt();
        System.out.println(smallestDivisor(nums,limit));
    }

    private static int smallestDivisor(int[] nums, int limit) {
        int max =Integer.MIN_VALUE,ans=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
        }
        int l=1,h=max;
        while(l<=h){
            int mid = l+(h-l)/2;
            if(can(nums,limit,mid)){
                ans=mid;
                h=mid-1;
            }else{
                l=mid+1;
            }
        }
        return ans;
    }

    private static boolean can(int[] nums, int limit, int mid) {
        int sum =0;
        for(int i=0;i<nums.length;i++){
            sum+=(nums[i]+mid-1)/mid;
        }
        return sum<=limit;
    }
}
