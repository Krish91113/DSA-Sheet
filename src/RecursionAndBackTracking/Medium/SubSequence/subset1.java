package RecursionAndBackTracking.Medium.SubSequence;

import java.util.*;

public class subset1 {

    public static void subsetSum(int i, int[] nums, int sum, List<Integer> ans) {
        if (i >= nums.length) {
            ans.add(sum);          // Add the final sum
            return;
        }

        // Pick current element
        subsetSum(i + 1, nums, sum + nums[i], ans);

        // Don't pick current element
        subsetSum(i + 1, nums, sum, ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        List<Integer> ans = new ArrayList<>();
        subsetSum(0, nums, 0, ans);
        for (int s : ans) {
            System.out.print(s);
        }
    }
}