package Arrays.hard;

import java.util.Arrays;
import java.util.*;

public class fourSum {
    public static List<List<Integer>> fourSums(int[] nums, int target) {  // naam fourSums nahi, fourSum rakho
        if(nums == null || nums.length < 4) return new ArrayList<>();

        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();   // Set use kar rahe ho toh chalta hai, but better hai List + manual skip

        for(int i = 0; i < nums.length - 3; i++) {           // length-3 tak better
            if(i > 0 && nums[i] == nums[i-1]) continue;

            for(int j = i + 1; j < nums.length - 2; j++) {
                if(j > i + 1 && nums[j] == nums[j-1]) continue;   // ← Yeh change karo

                int k = j + 1;
                int l = nums.length - 1;

                while(k < l) {
                    long sum = (long)nums[i] + nums[j] + nums[k] + nums[l];  // ← overflow se bachne ke liye long

                    if(sum == target) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));

                        // Duplicates skip karo left aur right dono taraf
                        k++;
                        l--;
                        while(k < l && nums[k] == nums[k-1]) k++;   // left duplicates skip
                        while(k < l && nums[l] == nums[l+1]) l--;   // right duplicates skip
                    }
                    else if(sum < target) {
                        k++;
                    }
                    else {
                        l--;
                    }
                }
            }
        }
        return new ArrayList<>(result);
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n  = sc.nextInt();
        int nums[] = new int[n];
        for(int i =0;i<nums.length;i++){
            nums[i] =sc.nextInt();
        }
        int target =sc.nextInt();
        System.out.println(fourSums(nums,target));
    }
}
