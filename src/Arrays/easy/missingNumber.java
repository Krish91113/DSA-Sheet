package Arrays.easy;

import java.util.Scanner;

public class missingNumber {
    private static int missingNo(int nums[]){
        int tSum=0;
        int n =nums.length;
        int sum=(n*(n+1)/2);
        for(int i=0;i<nums.length;i++){
             tSum +=nums[i];
        }
        return sum-tSum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i< nums.length;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(missingNo(nums));
    }
}
