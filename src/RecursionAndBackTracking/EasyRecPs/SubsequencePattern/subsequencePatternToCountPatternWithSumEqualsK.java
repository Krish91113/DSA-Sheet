package RecursionAndBackTracking.EasyRecPs.SubsequencePattern;
import java.util.*;
public class subsequencePatternToCountPatternWithSumEqualsK {
    public static int printf(int i, int nums[], int n, int sum, int k) {
        if (i >= n) {
            if (sum == k) return 1;
            else return 0;
        }

        // Include current element
        int l = printf(i + 1, nums, n, sum + nums[i], k);

        // Exclude current element
        int r = printf(i + 1, nums, n, sum, k);

        return l+r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(printf(0, nums, n, 0, k));

    }
}
