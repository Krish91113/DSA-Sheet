package BinarySearch;
import java.util.Scanner;

public class floorAndCeil {

    public static int[] findFloorAndCeil(int[] nums, int x) {
        int n = nums.length;
        if (n == 0) return new int[]{-1, -1}; // edge case

        int left = 0, right = n - 1;
        int floor = -1, ceil = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == x) {
                return new int[]{x, x}; // number exists → floor = ceil = x
            }
            else if (nums[mid] < x) {
                floor = nums[mid];
                left = mid + 1;
            }
            else { // nums[mid] > x
                ceil = nums[mid];
                right = mid - 1;
            }
        }

        return new int[]{floor, ceil};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int x = sc.nextInt();

        // ─── Important: store or print the result ───
        int[] result = findFloorAndCeil(nums, x);

        System.out.println("Floor = " + result[0]);
        System.out.println("Ceil  = " + result[1]);
        // or in one line:
        // System.out.println(result[0] + " " + result[1]);

        sc.close();
    }
}