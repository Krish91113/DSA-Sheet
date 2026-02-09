package Arrays.medium;
import java.util.*;

public class twoSum {
    public static int[] twoSumm(int[] nums, int target) {
        // Map to store: Value -> Index
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // Check if the number we need has already been seen
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            // Store the current number and its index
            map.put(nums[i], i);
        }
        return new int[] {}; // Return empty if no solution
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        // Use Arrays.toString to actually see the numbers in the console
        System.out.println(Arrays.toString(twoSumm(nums, target)));
    }
}