package SlidingWindow.Medium;
import java.util.*;
public class maxConsecutiveOnes3 {
    public static int longestOnes(int nums[],int k){
        int maxL = Integer.MIN_VALUE;
        int f=0;
        int l=0,r=0;
        int n=nums.length;
        // 1 1 1 0 0 0 1 1 1 1 0
        //         l
        //                     r
        while(r<n){
            if(nums[r]==0){
                f++;
            }
                while(f>k){
                    if(nums[l] == 0) f--;
                    l++;
                }
                if(f<=k) {
                    maxL = Math.max(maxL, r - l + 1);
                }
            r++;
        }
        return maxL;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        System.out.println(longestOnes(nums,k));
    }
}

