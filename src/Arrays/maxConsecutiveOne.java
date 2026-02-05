package Arrays;

import java.util.Scanner;

public class maxConsecutiveOne {
    private static int maxConsOne(int nums[]){
        int count=0,max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
                max=Math.max(count,max);
            }else{
                count=0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i< nums.length;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(maxConsOne(nums));
    }
}
