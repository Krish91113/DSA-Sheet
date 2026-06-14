package RecursionAndBackTracking.EasyRecPs.SubsequencePattern;
import java.util.*;
public class subsequenceSumEqualsKToPrint1SubsequencePattern {
    public static boolean printf(int i, ArrayList<Integer> li, int nums[], int n, int sum, int k) {
        if (i >= n) {
            if (sum == k) {
                for (int l = 0; l < li.size(); l++) {
                    System.out.print(li.get(l) + " ");
                }
                System.out.println();
                return true;
            }
            return false;
        }

        // Include current element
        li.add(nums[i]);
        if (printf(i + 1, li, nums, n, sum + nums[i], k)) {
            return true;
        }
        li.remove(li.size() - 1);

        // Exclude current element
        if (printf(i + 1, li, nums, n, sum, k)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        ArrayList<Integer> li = new ArrayList<>();
        boolean found = printf(0, li, nums, n, 0, k);

        if (!found) {
            System.out.println("No subsequence found with sum " + k);
        }
    }
}
