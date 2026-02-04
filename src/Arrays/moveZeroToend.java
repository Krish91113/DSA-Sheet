package Arrays;

import java.util.Scanner;

public class moveZeroToend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i< nums.length;i++){
            nums[i]=sc.nextInt();
        }
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[i]==0 && nums[j]!=0){
                int temp = nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
            }else if(nums[i]==0 && nums[j]==0){
                continue;
            }
        }
        for(int k=0;k<nums.length;k++){
            System.out.print(nums[k] + " ");
        }
    }
}
