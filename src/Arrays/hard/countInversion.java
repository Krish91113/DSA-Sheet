package Arrays.hard;

import java.util.*;

public class countInversion {
    private static int numberOfInversion(int[] nums){
        int c=0;
        for(int i= 0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    c++;
                }
            }
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n  = sc.nextInt();
        int nums[] = new int[n];
        for(int i =0;i<nums.length;i++){
            nums[i] =sc.nextInt();
        }
        System.out.println(numberOfInversion(nums));
    }
}
