package RecursionAndBackTracking.EasyRecPs.SubsequencePattern;

import java.util.*;

public class subsequenceSumLessThanTarget {
    public static int printf(int i, int nums[], int n, int sum, int k, int min, int max) {
        if (i >= n) {
            if (sum <= k) return 1;
            else return 0;
        }

        // Include current element
        min =Math.min(nums[i],min);
        max =Math.max(nums[i],max);
        sum = max +min;
        int l = printf(i + 1, nums, n, sum, k,min,max);
//        min =Math.min(nums[i],min);
//        max =Math.max(nums[i],max);
        sum = max-min;
        // Exclude current element
        int r = printf(i + 1, nums, n, sum, k,min,max);

        return l+r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int min =Integer.MAX_VALUE;
        int max =Integer.MIN_VALUE;
        int k = sc.nextInt();
        System.out.println(printf(0, nums, n, 0, k,min,max));

    }
}
