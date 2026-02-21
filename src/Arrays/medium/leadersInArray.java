package Arrays.medium;

import java.util.*;

public class leadersInArray {
    private static int[] leaderArray(int nums[]){
        int result[] =new int[nums.length];
        int maxR = Integer.MIN_VALUE;
        int k=0;
        for(int i= nums.length-1;i>=0;i--){
            if(nums[i]>maxR){
                result[k]=nums[i];
                maxR=nums[i];
                k++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n  = sc.nextInt();
        int nums[] = new int[n];
        for(int i =0;i<nums.length;i++){
            nums[i] =sc.nextInt();
        }
        System.out.println(Arrays.toString(leaderArray(nums)));
    }
}
