package Arrays.medium;

import java.util.Scanner;

public class rearrangeSign {
    private static void rearrangeSignArray(int nums[]){
        int positive=0,negative=1;
        int n=nums.length;
        int result[] = new int[nums.length];
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                result[positive]=nums[i];
                positive=positive+2;
            }else{
                result[negative]=nums[i];
                negative=negative+2;
            }
        }
        for(int l=0;l<n;l++){
            System.out.print(result[l] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n  = sc.nextInt();
        int nums[] = new int[n];
        for(int i =0;i<nums.length;i++){
            nums[i] =sc.nextInt();
        }
        rearrangeSignArray(nums);
    }
}
