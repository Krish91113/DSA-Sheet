package Arrays.easy;
import java.util.*;
public class linearSearch {
    private static int linearSearches(int nums[], int target){
        int ans =0;
        for(int i=0;i< nums.length;i++){
            if(nums[i] == target){
                ans =i;
                return ans;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i< nums.length;i++){
            nums[i]=sc.nextInt();
        }
        int target =sc.nextInt();
        System.out.println(linearSearches(nums, target));
    }
}
