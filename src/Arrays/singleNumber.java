package Arrays;

import java.util.Scanner;

public class singleNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i< nums.length;i++){
            nums[i]=sc.nextInt();
        }
        int xor = 0;
        for(int i=0;i<nums.length;i++){
            xor = xor ^ nums[i];
        }
        System.out.println(xor);
    }
}
