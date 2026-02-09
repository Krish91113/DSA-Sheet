package Arrays.medium;

import java.util.Scanner;

public class majorityElement {
    private static int majorityEle(int nums[]){
        int maj =0,count=0;
        for(int i=0;i<nums.length;i++){
            if(count == 0){
                maj=nums[i];
                count++;
            }else if(maj == nums[i]){
                count++;
            }else{
                count--;
            }
        }
        return maj;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n  = sc.nextInt();
        int nums[] = new int[n];
        for(int i =0;i<nums.length;i++){
            nums[i] =sc.nextInt();
        }
        System.out.println(majorityEle(nums));
    }
}
