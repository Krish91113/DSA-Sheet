package DynamicProgramming.DpOnLIS;

import java.util.*;

public class printLIS {
    public static List<Integer> solve(int arr[], int i, int p) {
        // Base Case: If we reach the end, return an empty list
        if (i >= arr.length) {
            return new ArrayList<>();
        }

        List<Integer> take = new ArrayList<>();
        // Option 1: Take the current element (if valid)
        if (p == -1 || arr[p] < arr[i]) {
            // Capture the result of the remaining array
            take = new ArrayList<>(solve(arr, i + 1, i));
            // Add the current element to the front of that result
            take.add(0, arr[i]);
        }

        // Option 2: Skip the current element
        List<Integer> skip = solve(arr, i + 1, p);

        // Decision Step: Return the path that yielded the longer subsequence
        if (take.size() > skip.size()) {
            return take;
        } else {
            return skip;
        }
    }

    public static List<Integer> lcs(int[] arr) {
        return solve(arr, 0, -1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        List<Integer> result = lcs(nums);
        System.out.println("Longest Increasing Subsequence: " + result);
    }
}
