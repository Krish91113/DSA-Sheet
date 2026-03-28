package Arrays.hard;

import java.util.*;

public class longSubWithSumZero {
    private static int maxlen(int nums[]){
        int c=0,sum= 0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum == 0){
                c=i+1;
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
        System.out.println(maxlen(nums));
    }
}
