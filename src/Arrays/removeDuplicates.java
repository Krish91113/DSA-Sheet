package Arrays;
import java.util.*;
public class removeDuplicates {
    public static int removeDuplicate(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 0; // The 'slow' pointer: represents the index of the last unique element found

        for (int j = 1; j < nums.length; j++) { // The 'fast' pointer: scans the array
            if (nums[j] != nums[i]) {
                i++;             // Move to the next available slot
                nums[i] = nums[j]; // Overwrite the duplicate with the new unique value
            }
        }

        // The number of unique elements is i + 1 (since i is an index)
        return i + 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i< nums.length;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(removeDuplicate(nums));
    }
}
