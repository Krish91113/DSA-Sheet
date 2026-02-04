package Arrays;

import java.util.Scanner;

public class leftRotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i< nums.length;i++){
            nums[i]=sc.nextInt();
        }
        int temp=nums[0];
        for(int i=1;i<nums.length;i++){
            nums[i-1]=nums[i];
        }
        nums[nums.length-1]=temp;
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i] + " ");
        }
    }
}
