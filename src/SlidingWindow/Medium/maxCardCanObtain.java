package SlidingWindow.Medium;
import java.util.*;
public class maxCardCanObtain {
        public static int maxScore ( int[] cardPoints, int k){
            int sum = 0;
            int maxL = Integer.MIN_VALUE;
            for (int i = 0; i < k; i++) {
                sum += cardPoints[i];
                maxL = Math.max(maxL, sum);
            }
            int r = cardPoints.length - 1;
            int rsum = 0;
            for (int i = k - 1; i >= 0; i--) {
                sum = sum - cardPoints[i];
                rsum = rsum + sum + cardPoints[r];
                maxL = Math.max(maxL, rsum);
                r--;
            }
            return maxL;
        }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int nums[] =new int[n];
        for(int i= 0;i<n;i++){
            nums[i] =sc.nextInt();
        }
        int k=sc.nextInt();
        System.out.println(maxScore(nums,k));
    }
}
